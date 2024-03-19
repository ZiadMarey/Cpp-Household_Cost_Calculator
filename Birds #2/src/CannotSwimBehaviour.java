public class CannotSwimBehaviour implements SwimBehaviour {
    public float getMaxWaterSpeed(){
        return 0;
    }
    public void setMaxWaterSpeed(float maxWaterSpeed){

    }
    public void jumpIntoWater(){
        System.out.println("Cannot Swim");
    }
    public void leaveWater(){
        System.out.println("Cannot Swim");
    }
    public void swim(){
        System.out.println("Cannot Swim");
    }
}
