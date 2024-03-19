public class UniquelyAwsomeEngine implements Engine{

    private int numberOfPistons;
    private int size;
    private int fuelConsumption;
    public UniquelyAwsomeEngine(int numberOfPistons, int size, int fuelConsumption){
        this.numberOfPistons = numberOfPistons;
        this.size = size;
        this.fuelConsumption = fuelConsumption;
    }

    @Override
    public int getNumberOfPistons() {
        return numberOfPistons;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    public int getFuelConsumption() {
        return fuelConsumption;
    }
}
