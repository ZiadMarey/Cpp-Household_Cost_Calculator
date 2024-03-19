public class Penguin extends Bird{
    public void eatFood(){
        System.out.println("I eat Fish");
    }

    public Penguin(String name, int age, float weight ) {
        super(name,age,weight,new CanFlyBehaiour(),new CannotSwimBehaviour());
    }
}
