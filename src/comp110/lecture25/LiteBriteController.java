package comp110.lecture25;

import javafx.fxml.FXML;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class LiteBriteController {

    // Constants
    public static int COLUMNS = 24;
    public static int ROWS = 16;
    public static double OFFSET = 17.0;
    public static double RADIUS = 8.0;
    public static int SINGLE_MODE = 0, FILL_MODE = 1, ROW_MODE = 2, COLUMN_MODE = 3, SQUARE_MODE = 4, RING_MODE = 5;
    public static Color DARK = new Color(0.1, 0.1, 0.1, 1.0);

    // View Fields
    @FXML
    private Pane _container;

    // Fields
    private Circle[][] _grid;

    private int _mode;

    // Methods - remember in JavaFX Controllers, initialize acts as the
    // constructor
    public void initialize() {

        _mode = SINGLE_MODE;

        // TODO: Construct the 2D array using COLUMNS x ROWS

        // TODO: Initialize each element of the array
        // using the below template for each Circle
        Circle c = new Circle();
        c.setCenterX(OFFSET);
        c.setCenterY(OFFSET);
        c.setRadius(RADIUS);
        c.setOnMouseClicked(this::handle);
        c.setFill(Color.WHITE);
        _container.getChildren().add(c);
        // Assign the circle to the correct element in the 2-d array

    }

    /*
     * The following methods are each called when a user clicks on a given
     * circle in the array. The two parameters are the indices of the array of
     * the circle that was clicked on.
     */

    private void single(int column, int row) {
        // TODO
    }

    private void fill(int column, int row) {
        // TODO
    }

    private void row(int column, int row) {
        // TODO
    }

    private void column(int column, int row) {
        // TODO
    }

    private void square(int column, int row) {
        // TODO
    }

    private void ring(int column, int row) {
        // TODO
    }

    /**
     * The handle method simply takes the MouseEvent and uses some basic
     * arithmetic to figure out the indices in the 2D array of the circle that
     * was clicked on.
     * 
     * It then calls one of the methods we'll implement above with each index as
     * an argument.
     * 
     * @param event
     */
    private void handle(MouseEvent event) {
        Circle target = (Circle) event.getTarget();
        int column = (int) (target.getCenterX() / OFFSET);
        int row = (int) (target.getCenterY() / OFFSET);
        if (_mode == ROW_MODE) {
            this.row(column, row);
        } else if (_mode == COLUMN_MODE) {
            this.column(column, row);
        } else if (_mode == SQUARE_MODE) {
            this.square(column, row);
        } else if (_mode == RING_MODE) {
            this.ring(column, row);
        } else if (_mode == SINGLE_MODE) {
            this.single(column, row);
        } else if (_mode == FILL_MODE) {
            this.fill(column, row);
        }
    }

    /* Event handlers for when each of the radio buttons is selected */

    public void setSingleMode() {
        _mode = SINGLE_MODE;
    }

    public void setFillMode() {
        _mode = FILL_MODE;
    }

    public void setRowMode() {
        _mode = ROW_MODE;
    }

    public void setColumnMode() {
        _mode = COLUMN_MODE;
    }

    public void setSquareMode() {
        _mode = SQUARE_MODE;
    }

    public void setRingMode() {
        _mode = RING_MODE;
    }

}
