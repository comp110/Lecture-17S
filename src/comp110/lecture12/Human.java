package comp110.lecture12;

public class Human {

	private String _name;
	private int _pushups;

	public Human() {
		_name = "No name";
		_pushups = 0;
	}

	// TODO: Add getter and setter for _name field here

	public int getPushups() {
		return _pushups;
	}

	public void doPushups(int n) {
		// TODO: implement this method
	}

	public void pushup() {
		this.lower();
		this.push();
		_pushups++;
		System.out.println(_name + " pushup #" + _pushups);
	}

	public void lower() {
		System.out.println(_name + " lowers...");
	}

	public void push() {
		System.out.println(_name + " pushes...");
	}

	public String toString() {
		return _name + " has done " + _pushups + " pushups";
	}

}