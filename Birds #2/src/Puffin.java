public class Puffin extends Bird{


    public Puffin(String name, int age, float weight ) {
        super(name,age,weight,new CanFlyBehaiour(),new CannotSwimBehaviour());

    }

}
