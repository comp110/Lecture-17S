package comp110.lecture11;

public class Tweet {

	private String _handle;
	private String _text;
	private int _likes;

	public Tweet(String handle, String text) {
		_handle = handle;
		_text = text;
		_likes = -1;
	}

	public int getLikes() {
		return _likes;
	}

	// TODO: Add a like method

	// TODO: Add a retweet method

	public String toString() {
		String socialLove = " - " + _likes + " likes";
		return "@" + _handle + ": " + _text + " " + socialLove;
	}

}