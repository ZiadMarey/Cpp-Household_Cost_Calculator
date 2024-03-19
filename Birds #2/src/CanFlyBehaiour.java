public class CanFlyBehaiour implements Flybehaviour{
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
    public void setMaxAirSpeed(float maxAirSpeed) {
        this.maxAirSpeed = maxAirSpeed;
    }
}
