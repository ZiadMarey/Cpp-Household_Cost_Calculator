public class Seagull extends Bird {
    public void eatFood(){

        System.out.println("I eat Fish");
    }
    public Seagull(String name, int age, float weight ) {
        super(name,age,weight,new CanFlyBehaiour(),new CannotSwimBehaviour());

    }
}
