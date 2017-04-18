package comp110.lecture25;

import javafx.fxml.FXML;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class GridController {

  public static int COLUMNS = 24;
  public static int ROWS = 16;
  public static double OFFSET = 17.0;
  public static double RADIUS = 8.0;

  public static int SINGLE_MODE = 0, FILL_MODE = 1, ROW_MODE = 2, COLUMN_MODE = 3, SQUARE_MODE = 4, RING_MODE = 5;

  public static Color DARK = new Color(0.1, 0.1, 0.1, 1.0);

  @FXML
  private Pane _container;

  private Circle[][] _grid;

  private int _mode;

  public void initialize() {

    _mode = SINGLE_MODE;

    _grid = new Circle[COLUMNS][ROWS];
    for (int j = 0; j < _grid.length; j++) {
      for (int y = 0; y < _grid[j].length; y++) {
        Circle c = new Circle();
        c.setCenterX(j * OFFSET);
        c.setCenterY(y * OFFSET);
        c.setRadius(RADIUS);
        c.setOnMouseClicked(this::handle);
        c.setFill(DARK);
        _container.getChildren().add(c);
        _grid[j][y] = c;
      }
    }

  }

  private void single(int i, int j) {
    _grid[i][j].setFill(Color.WHITE);
  }

  private void fill(int i, int j) {
    for (int x = 0; x < _grid.length; x++) {
      for (int y = 0; y < _grid[0].length; y++) {
        _grid[x][y].setFill(DARK);
      }
    }
  }

  private void row(int i, int j) {
    for (int x = 0; x < _grid.length; x++) {
      _grid[x][j].setFill(Color.BLUE);
    }
  }

  private void column(int i, int j) {
    for (int y = 0; y < _grid[i].length; y++) {
      _grid[i][y].setFill(Color.RED);
    }
  }

  private void square(int i, int j) {
    for (int x = i - 1; x <= i + 1; x++) {
      for (int y = j - 1; y <= j + 1; y++) {
        _grid[x][y].setFill(Color.GREEN);
      }
    }
  }

  private void ring(int i, int j) {
    for (int x = i - 1; x <= i + 1; x++) {
      for (int y = j - 1; y <= j + 1; y++) {
        if (x != i || y != j) {
          _grid[x][y].setFill(Color.ORANGE);
        }
      }
    }
  }

  private void handle(MouseEvent event) {
    Circle target = (Circle) event.getTarget();
    int i = (int) (target.getCenterX() / OFFSET);
    int j = (int) (target.getCenterY() / OFFSET);
    if (_mode == ROW_MODE) {
      this.row(i, j);
    } else if (_mode == COLUMN_MODE) {
      this.column(i, j);
    } else if (_mode == SQUARE_MODE) {
      this.square(i, j);
    } else if (_mode == RING_MODE) {
      this.ring(i, j);
    } else if (_mode == SINGLE_MODE) {
      this.single(i, j);
    } else if (_mode == FILL_MODE) {
      this.fill(i, j);
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
