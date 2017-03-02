package comp110.lecture14;

public class CallStack {

	public static void main(String[] args) {
		CallStack demo = new CallStack();
		demo.stackOverflow(0);
	}

	// No Fields
	// Default Constructor (Same as an Empty Constructor)

	public void stackOverflow(int n) {
		System.out.println("Stacking... " + n);
		this.stackOverflow(n + 1);
	}

	public void avoidOverflow(int n) {
		System.out.println("Stacking... " + n);
		// TODO: Add a test for our base case...
		this.avoidOverflow(n - 1);
		System.out.println("Unstacking... " + n);
	}

}