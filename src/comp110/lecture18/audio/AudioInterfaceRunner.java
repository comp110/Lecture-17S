package comp110.lecture18.audio;

public class AudioInterfaceRunner {

    public static void main(String[] args) {

        Phone myPhone = new Phone();

        Headphones headphones = new Headphones();

        myPhone.setDevice(headphones);
        myPhone.play("Twenty One Pilots");

        Speakers bose = new Speakers();
        // TODO: Play out of the Speakers

        // TODO: Pass the AuxCord

    }

}