public class CanSwimBehaviour implements SwimBehaviour{
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
