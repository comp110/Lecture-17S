package comp110.lecture19;

import java.util.Comparator;
import java.util.List;

import javafx.fxml.FXML;
import javafx.scene.control.ListView;

public class TeamController {

    // Control Fields
    @FXML
    private ListView<Player> _playersListView;

    // Fields
    private List<Player> _players;

    // JavaFX calls the initialize method once the View is bound to the Controller
    public void initialize() {
        _players = _playersListView.getItems();
    }

    public void loadTeam() {
        RosterLoader rosterLoader = new RosterLoader();
        rosterLoader.load(_players);
    }

    public void addLuke() {
        // TODO
        _players.add(new Player("Maye", 20, 17));
    }

    public void remove() {
        Player selected = _playersListView.getSelectionModel().getSelectedItem();
        // TODO
        _players.remove(selected);
    }

    public void sortPoints() {
        // TODO
        Comparator<Player> comparator = new PointsComparator();
        _players.sort(comparator);
    }

    public void sortName() {
        // TODO
        Comparator<Player> comparator = new PlayerComparator(PlayerComparator.NAME);
        _players.sort(comparator);
    }

    public void sortEfficiency() {
        // TODO
        Comparator<Player> comparator = new PlayerComparator(PlayerComparator.EFFICIENCY);
        _players.sort(comparator);
    }

}