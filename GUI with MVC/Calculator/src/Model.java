import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

import java.util.ArrayList;

public class Model extends SimpleStringProperty {

    private int firstNumber;
    private int secondNumber;
    private String operation;
    private TextField listener;
    private int count = 0;
    public StringProperty currentInput = new SimpleStringProperty("");// tracks press by press

    public StringProperty getCurrentInput(){
        return currentInput;
    }
    public void addNumberToCurrent(int n){
        currentInput.setValue(currentInput.getValue() + n);
        count ++;

    }
    public void clearTextBox(){
        currentInput.setValue("");

    }

    public void storeOperation(String Operation){
        this.operation = Operation;
    }
    public void storeFirstNumber(){
        this.firstNumber =Integer.parseInt(currentInput.getValue());
    }
    public void storeSecondNumber(){
        this.secondNumber =Integer.parseInt(currentInput.getValue());
    }
    public int getFirstNumber(){
        return firstNumber;
    }
    public int getSecondNumber(){
        return secondNumber;
    }
    public String getOperation(){
        return operation;
    }
    public void clearOneNumber(){
        currentInput.setValue(currentInput.getValue().substring(0,count));

    }
    public void setInput(int n){
        currentInput.setValue(""+n);

    }



}

