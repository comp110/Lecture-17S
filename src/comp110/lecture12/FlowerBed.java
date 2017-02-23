package comp110.lecture12;

public class FlowerBed {

	public static void main(String[] args) {

		comp110.Canvas canvas = new comp110.Canvas();

		Flower flower = new Flower();
		canvas.draw(flower.getShapes());

	}

}