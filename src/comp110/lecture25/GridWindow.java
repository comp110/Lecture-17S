package comp110.lecture25;

import java.io.IOException;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class GridWindow {

  public GridWindow() {
    try {
      // Setup a Controller and some variables that plug-in to the
      // boilerplate below
      GridController controller = new GridController();
      String viewFile = "GridView.fxml";
      String windowTitle = "Grid World";
      // Setup the View's FXML Loader
      FXMLLoader loader = new FXMLLoader(this.getClass().getResource(viewFile));
      loader.setController(controller);
      // Show the window
      Stage stage = new Stage();
      stage.setScene(new Scene(loader.load()));
      stage.setTitle(windowTitle);
      stage.show();
    } catch (IOException e) {
      e.printStackTrace();
    }
  }

}
