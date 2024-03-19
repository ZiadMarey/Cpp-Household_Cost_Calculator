public class CannotFlyBehaviour implements Flybehaviour {

    float maxAirSpeed;

    public void fly(){
        System.out.println("Cannot Fly");
    };
    public void liftOff(){
        System.out.println("Cannot Fly");
    }
    public void land(){
        System.out.println("Cannot Fly");
    }

    @Override
    public float getMaxAirSpeed() {
        return 0;
    }

    public void setMaxAirSpeed(float maxAirSpeed) {
    }
}
