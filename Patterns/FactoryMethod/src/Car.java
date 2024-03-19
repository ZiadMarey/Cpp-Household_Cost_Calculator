import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public interface Car {



    Color getColor();

    public List<Seat> getSeats();
     public Engine getEngine();
    void fuelUp();
    Boolean testDrive();

}
