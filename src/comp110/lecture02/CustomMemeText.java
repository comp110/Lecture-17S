package comp110.lecture02;

import comp110.Console;
import comp110.memes.MemePhoto;

public class CustomMemeText {

  public static void main(String[] args) {

    Console console = new Console("Custom Meme Text Demo");

    MemePhoto meme = new MemePhoto();
    meme.setImageUrl("http://i.imgur.com/sjCYBBO.jpg");

    // TODO: Prompt for a String and assign to topText variable.
    String topText = "replace this String";
    meme.setTopText(topText);
    
    // TODO: Prompt for a String and assign to bottomText variable.
    String bottomText = "replace this String, too";
    meme.setBottomText(bottomText);

  }

}