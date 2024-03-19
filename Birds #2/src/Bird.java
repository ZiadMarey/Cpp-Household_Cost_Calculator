import jdk.jfr.FlightRecorder;

public abstract class Bird {

    private String Name;
    private int age;

    private float weight;

    private SwimBehaviour swimBehaviour;
    private Flybehaviour flybehaviour;
    public void setName(String Name){
        this.Name = Name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void setWeight(float weight){
        this.weight = weight;
    }
    public String getName(){
        return this.Name;
    }
    public int getAge(){
        return this.age;
    }
    public float getWeight(){
        return this.weight;
    }
    public void eatFood(){};
    public void fly(){
        flybehaviour.fly();
    };

    public Bird(String Name, int Age, float Weight, Flybehaviour flyBehaviour,SwimBehaviour swimBehaviour) {
        this.Name = Name;
        this.age = Age;
        this.weight = Weight;
        this.flybehaviour = flyBehaviour;
        this.swimBehaviour = swimBehaviour;
    }
}
