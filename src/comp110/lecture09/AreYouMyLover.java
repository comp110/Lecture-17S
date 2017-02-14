package comp110.lecture09;

public class AreYouMyLover {

	public static void main(String[] args) {
		Console console = new Console("Are you my lover?");
		console.speed(0.5);

		while (true) {

			console.alert("Are you my lover? Enter your info to find out!");
			LoverProfile maybae = new LoverProfile();

			console.print("Welcome " + maybae.getName());

		}

	}
}