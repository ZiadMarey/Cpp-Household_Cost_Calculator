public interface SwimBehaviour {
    float getMaxWaterSpeed();
    void setMaxWaterSpeed(float maxWaterSpeed);
    public void jumpIntoWater();
    public void leaveWater();
    public void swim();
}
