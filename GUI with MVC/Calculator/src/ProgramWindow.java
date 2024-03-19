
import java.awt.*;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import java.util.List;

import javafx.stage.Stage;

public class ProgramWindow extends Application {

    View2 saveView;

    public void start(Stage primaryStage){ //stage is the window "the outer part" , the view is a scene -> the inner part of the window that actually functions
        primaryStage.setTitle("Calculator");
        Scene scene = new Scene(saveView);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    public ProgramWindow(){
        Model model = new Model();
        Controller controller = new Controller(model);
        saveView = new View2(controller,model);
    }


}
