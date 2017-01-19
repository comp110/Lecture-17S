package comp110.lecture02;

import comp110.Console;
import comp110.memes.MemePhoto;

public class CustomMemeText {

  public static void main(String[] args) {

    Console console = new Console("Custom Meme Text Demo");

    // TODO: Use the console to prompt for each String
    String topText = "";
    String bottomText = "";

    MemePhoto meme = new MemePhoto();
    meme.setImageUrl("http://i.imgur.com/sjCYBBO.jpg");

    // TODO: Replace the empty quotes with the variables
    // topText and bottomText
    meme.setTopText("");
    meme.setBottomText("");

  }

}