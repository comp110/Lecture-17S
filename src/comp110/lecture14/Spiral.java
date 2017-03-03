package comp110.lecture14;

import comp110.Canvas;
import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

public class Spiral {

	public static void main(String[] args) {

		Canvas canvas = new Canvas();
		Spiral drawing = new Spiral(0.98, 10.0, 10.0);
		canvas.draw(drawing.spiral(10.0));

	}

	// Fields
	private double _shrink;
	private double _rotate;
	private double _space;

	// Constructor
	public Spiral(double shrink, double rotate, double space) {
		_shrink = shrink;
		_rotate = rotate;
		_space = space;
	}

	public Group spiral(double width) {
		Group group = new Group();

		Rectangle square = new Rectangle(width, width);
		square.setY(width * _space); // Notice!
		square.setFill(Color.ALICEBLUE);
		group.getChildren().add(square);

		// TODO: Call spiral recursively to generate a spiral!

		return group;
	}

}
