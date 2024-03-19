import java.util.ArrayList;
import java.util.List;

public class Ford implements Car{

    private List<Seat> seats = new ArrayList<Seat>();
    private Color color;
    Engine engine;
    Boolean testDrive;
    Ford(Color carColor, Color seatColor){
        for(int i = 0;i<5 ; i++){
            seats.add(new SeatClass(seatColor))  ;
        }
        this.color = carColor;
        this.engine = new EngineClass(15,2000);
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
