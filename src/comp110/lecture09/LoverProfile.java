package comp110.lecture09;

// Class Declaration
public class LoverProfile {

	// Field Declarations
	private String _name;
	private int _age;
	private boolean _lovesUNC;

	// Constructor
	public LoverProfile() {

		Console console = new Console();
		_name = console.promptString("Name");
		_age = console.promptInt("Age");
		_lovesUNC = console.confirm("Do you love UNC?");
		console.close();

	}

	// Methods
	public String getName() {
		return _name;
	}

	public int getAge() {
		return _age;
	}

	public int minimumMatchAge() {
		return _age / 2 + 7;
	}

	public boolean match() {
		return true;
	}

}