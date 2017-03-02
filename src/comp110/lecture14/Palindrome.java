package comp110.lecture14;

public class Palindrome {

    public static void main(String[] args) {
        Palindrome palindrome = new Palindrome();
        System.out.println(palindrome.make("ab", 0));
    }

    // No Fields

    // No Constructor (Same thing as an empty constructor!)

    public String make(String in, int i) {
        if (i == in.length()) {
            return "";
        } else {
            char head = in.charAt(i);
            String recur = this.make(in, i + 1);
            return head + recur + head;
        }
    }

}