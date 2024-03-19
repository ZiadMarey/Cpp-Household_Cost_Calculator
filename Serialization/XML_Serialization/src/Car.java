import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Car extends Vehicle implements Serializable {

    public Car(){}
    private String model;
    private List<Wheel> wheel = new ArrayList<Wheel>();
    private List<Seat> seats = new ArrayList<Seat>();
    Engine engine;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public List<Seat> getSeats() {
        return seats;
    }

    public void setSeats(List<Seat> seats) {
        this.seats = seats;
    }

    public List<Wheel> getWheel() {
        return wheel;
    }

    public void setWheel(List<Wheel> wheel) {
        this.wheel = wheel;
    }


}
