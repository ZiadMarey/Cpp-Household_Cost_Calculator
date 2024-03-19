public class SwimFly implements Flybehaviour,SwimBehaviour{
    private float maxAirSpeed;
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
    public void setMaxAirSpeed(float maxAirSpeed){};


    public float maxWaterSpeed;
    public void jumpIntoWater(){
        System.out.println("Jumps into Water");
    }
    public void leaveWater(){
        System.out.println("Leaves Water");
    }
    public void swim(){
        System.out.println("Swims");
    }
    public float getMaxWaterSpeed(){
        return this.maxWaterSpeed;
    }
    public void setMaxWaterSpeed(float maxWaterSpeed) {
        this.maxWaterSpeed = maxWaterSpeed;
    }
}
