public class Eagle extends Bird {
    public void eatFood() {
        System.out.println("I eat smaller mammals");
    }
    public Eagle(String name, int age, float weight ) {
        super(name,age,weight,new CanFlyBehaiour(),new CannotSwimBehaviour());

    }
}
