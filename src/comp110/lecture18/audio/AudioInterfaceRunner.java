package comp110.lecture18.audio;

public class AudioInterfaceRunner {

    public static void main(String[] args) {

        Phone myPhone = new Phone();

        myPhone.setDevice(new Headphones());
        myPhone.play("Twenty One Pilots");

        Speakers bose = new Speakers();
        bose.turnOn();
        myPhone.setDevice(bose);
        myPhone.play("Bob Marley");

        // TODO: Pass the AuxCord

    }

}