package comp110.lecture17;

import java.io.IOException;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class TearsWindow {

    private Stage _stage;

    private TearsController _controller;

    public TearsWindow() {
        // The following is boilerplate JavaFX code for setting up the View-Controller pair.

        // This try/catch block is beyond the scope of 110. Essentially it tells Java what to do in the
        // erroneous event the TearsView.fxml file does not exist or cannot be loaded.
        try {

            // Setup the Window's Controller
            _controller = new TearsController();

            // Configure the FXML loader to prepare to load the view
            FXMLLoader loader = new FXMLLoader(TearsController.class.getResource("TearsView.fxml"));

            // Associate the Controller with the View that is going to be loaded
            loader.setController(_controller);

            // Load the View
            AnchorPane fxml = loader.load(); // AnchorPane is because it is the outermost node in the FXML

            // Show the Window
            Scene scene = new Scene(fxml); // A Scene fills a Stage
            _stage = new Stage(); // A Stage is the visible Window in JavaFX
            _stage = new Stage();
            _stage.setTitle("COMP110 - Paint the Tears");
            _stage.setScene(scene);
            _stage.show();

        } catch (IOException e) {
            // If the FXML file could not be loaded, the execution will jump to this point and the stack trace will
            // print.
            e.printStackTrace();
        }
    }

    public void close() {
        _stage.close();
    }

}
