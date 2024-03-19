import java.util.ArrayList;
import java.util.List;

public class EngineClass implements Engine {
    public int size,fuelConsumption;
    List<Piston> pistons = new ArrayList<Piston>();
    EngineClass(int size,int fuelConsumption){
        this.size = size;
        this.fuelConsumption = fuelConsumption;
    }
    @Override
    public int getNumberOfPistons() {
        return pistons.size();
    }

    @Override
    public double getSize() {
        return this.size;
    }

    @Override
    public int getFuelConsumption() {
        return fuelConsumption;
    }
}
