import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Car {


    Engine engine;
    List<Seat> seats;
    Color color;

    Boolean testDrive;
    Color getColor() {
        return color;
    }

    public Car(Engine engine,List<Seat> seats , Color color , Boolean testDrive){
        this.engine = engine;
        this.testDrive = testDrive;
        this.color = color;
        this.seats = seats;
    }
    public List<Seat> getSeats() {
        return seats;
    }

    public Engine getEngine() {
        return engine;
    }

    void fuelUp() {

    }

    Boolean testDrive() {
        return testDrive;
    }

}
