package comp110.lecture14;

public class Palindrome {

	public static void main(String[] args) {
		Palindrome palindrome = new Palindrome();
		System.out.println(palindrome.make("carol"));
	}

	// No Fields

	// No Constructor (Same thing as an empty constructor!)

	public String make(String input) {
		if (input.length() <= 1) {
			return input;
		} else {
			char head = input.charAt(0);
			String tail = input.substring(1, input.length());
			String recur = this.make(tail);
			return head + recur + head;
		}
	}

}