package comp110.lecture14;

import comp110.Canvas;
import javafx.scene.Group;
import javafx.scene.shape.Rectangle;

public class Spiral {

    public static void main(String[] args) {

        Canvas canvas = new Canvas();
        Spiral drawing = new Spiral(0.98, 10.0, 10.0);
        canvas.draw(drawing.spiral(10.0));

    }

    // Fields
    private double _stepSize;
    private double _rotation;
    private double _spacing;

    // Constructor
    public Spiral(double stepSize, double rotation, double spacing) {
        _stepSize = stepSize;
        _rotation = rotation;
        _spacing = spacing;
    }

    public Group spiral(double width) {
        Group group = new Group();
        Rectangle square = new Rectangle(width, width);
        square.setY(width * _spacing);
        group.getChildren().add(square);
        if (width < 1.0) {
            // Base case, do not recur
        } else {
            Group branch = this.spiral(width * _stepSize);
            branch.setRotate(_rotation);
            group.getChildren().add(branch);
        }
        return group;
    }

}
