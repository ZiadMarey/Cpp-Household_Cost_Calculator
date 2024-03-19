public class Flyers extends Bird{
    public float maxAirSpeed;
    public void fly(){
        System.out.println("Flies");
    }
    public void liftOff(){
        System.out.println("Lifts Off");
    }
    public void land(){
        System.out.println("Lands");
    }
    public float getMaxAirSpeed(){
        return maxAirSpeed;
    }
}
