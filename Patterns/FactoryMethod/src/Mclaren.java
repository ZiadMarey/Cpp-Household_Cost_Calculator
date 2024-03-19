import java.util.ArrayList;
import java.util.List;

public class Mclaren implements Car{

    private List<Seat> seats = new ArrayList<Seat>();
    private Color color;
    Engine engine;
    Boolean testDrive;
    Mclaren(Seat seats,Color color,Engine engine, Boolean testDrive){
        this.seats.add(seats);
        this.color = color;
        this.engine = engine;
        this.testDrive = testDrive;
    }
    @Override
    public Color getColor() {
        return this.color;
    }

    @Override
    public List<Seat> getSeats() {
        return this.seats;
    }

    @Override
    public Engine getEngine() {
        return this.engine;
    }

    @Override
    public void fuelUp(){
        System.out.println("Fueled up");
    }

    @Override
    public Boolean testDrive() {
        return this.testDrive;
    }
}
