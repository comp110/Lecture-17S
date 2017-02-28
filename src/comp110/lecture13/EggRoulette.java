package comp110.lecture13;

import java.util.Random;

import javafx.scene.Group;

public class EggRoulette {

    private Carton _eggs;
    private int[] _scores;
    private int _turn;

    public EggRoulette(int players) {
        _scores = new int[players];
        _turn = 0;
        this.initializeEggs();
    }

    // Talk about private?
    private void initializeEggs() {
        _eggs = new Carton();

        for (int i = _eggs.size() / 4; i < _eggs.size(); i++) {
            Egg selected = _eggs.takeEgg(i);
            selected.boil();
            _eggs.setEgg(i, selected);
        }

        Random random = new Random();
        for (int i = 0; i < _eggs.size(); i++) {
            int a = random.nextInt(_eggs.size());
            int b = random.nextInt(_eggs.size());
            Egg temp = _eggs.takeEgg(a);
            _eggs.setEgg(a, _eggs.takeEgg(b));
            _eggs.setEgg(b, temp);
        }
    }

    public Egg pick(int index) {
        Egg selected = _eggs.takeEgg(index);
        if (selected != null) {
            if (selected.isRaw()) {
                _scores[this.getPlayer()]++;
            }
        }
        _turn++;
        return selected;
    }

    public int getPlayer() {
        return _turn % _scores.length;
    }

    public boolean isGameOver() {

        if (_eggs.remaining() <= 0) {
            return true;
        }

        for (int i = 0; i < _scores.length; i++) {
            if (_scores[i] >= 2) {
                return true;
            }
        }
        return false;
    }

    public int getLoser() {
        for (int i = 0; i < _scores.length; i++) {
            if (_scores[i] >= 2) {
                return i;
            }
        }
        return -1;
    }

    public Group getShapes() {
        return _eggs.getShapes();
    }

}
