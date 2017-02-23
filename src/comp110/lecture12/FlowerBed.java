package comp110.lecture12;

import java.util.Random;
import javafx.scene.paint.Color;

public class FlowerBed {

	public static void main(String[] args) {

		comp110.Canvas canvas = new comp110.Canvas();

		// Random random = new Random();
		// double red = random.nextDouble();
		// double green = random.nextDouble();
		// double blue = 0.9;
		// Color color = new Color(red, green, blue, 1.0);

		Flower flower = new Flower();
		canvas.draw(flower.getShapes());

	}

}
