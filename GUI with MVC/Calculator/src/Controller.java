public class Controller {

    Model model;
    int result;

    public Controller( Model model){

        this.model = model;
    }
    public void numberButtonPress(int number){
        model.addNumberToCurrent(number);
    }
    public void operationButtonPress(String operation){
        model.storeFirstNumber();
        model.storeOperation("operation");
        model.clearTextBox();

    }
    public void cButtonPress(String C){
        model.clearOneNumber();
    }
    public void ceButtonPress(String CE){
        model.clearTextBox();
    }
    public void resultButtonPress(){
        model.storeSecondNumber();
        System.out.println(model);
        System.out.println(model.getOperation());
        switch(model.getOperation()){
            case"+":
            {
                result = model.getFirstNumber() + model.getSecondNumber();
            }break;
            case"-":
            {
                result = model.getFirstNumber() - model.getSecondNumber();
            }break;
            case"X":
            {
                result = model.getFirstNumber() * model.getSecondNumber();
            }break;
            case"/":
            {
                result = model.getFirstNumber() / model.getSecondNumber();
            }break;
            default:
            {
                System.out.println("fault");
            }
        }

    model.setInput(result);
    }


}
