public class AudiEngine implements Engine {

    int numOfPistons;
    int size;
    int fuelConsumption;
    public AudiEngine(int numOfPistons, int size, int fuelConsumption){
        this.numOfPistons = numOfPistons;
        this.fuelConsumption = fuelConsumption;
        this.size = size;
    }


    @Override
    public int getNumberOfPistons() {
        return this.numOfPistons;
    }

    @Override
    public int getSize() {
        return this.size;
    }

    @Override
    public int getFuelConsumption() {
        return this.fuelConsumption;
    }
}
