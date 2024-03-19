import javafx.geometry.Pos;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import java.util.ArrayList;


//small server parallel with threads
//probably no StringProperty
//study integer.parse, toString, ...

public class View2 extends BorderPane {

    GridPane gridPane = new GridPane();
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9; // we can define all buttons one by one instead of the array and the for loop
    ArrayList<Button> buttonList = new  ArrayList<Button>();

    public View2(Controller controller, Model model){

        for(int i=0;i<10;i++) {
            Button button = new Button(i + "");
            int finalI = i;
            button.setOnAction((d)->controller.numberButtonPress(finalI)); //is executed when the button is clicked,
            buttonList.add(button);
        }

        Button C = new Button("C");
        C.setOnAction((random)->controller.cButtonPress("C"));
        Button CE = new Button("CE");
        CE.setOnAction((random)->controller.ceButtonPress("CE"));


        gridPane.addRow(0, buttonList.get(1),buttonList.get(2),buttonList.get(3));
        gridPane.addRow(1,buttonList.get(4),buttonList.get(5),buttonList.get(6));
        gridPane.addRow(2,buttonList.get(7),buttonList.get(8),buttonList.get(9));
        gridPane.addRow(3,C,buttonList.get(0), CE);

        Button multiply = new Button("X");
        multiply.setOnAction((random)->controller.operationButtonPress("X"));// here view calls controller and says "X is pressed", then controller changes the model and executes the operation button press
        Button add = new Button("+");
        add.setOnAction((random)->controller.operationButtonPress("+"));
        Button divide = new Button("/");
        divide.setOnAction((random)->controller.operationButtonPress("/"));
        Button subtract = new Button("-");
        subtract.setOnAction((random)->controller.operationButtonPress("-"));
        Button result = new Button("=");
        result.setOnAction((random)->controller.resultButtonPress());



        TextField textField = new TextField();
        model.getCurrentInput().addListener((random,old,newl)->textField.setText(newl)); // this is the line where we make the textfield display what we are typing in real time (aka currentInput)
        VBox vbox = new VBox(add,subtract,multiply,divide,result);


        HBox hbox = new HBox(textField);

        this.setTop(hbox);
        this.setLeft(gridPane);
        this.setRight(vbox);


    }


}
