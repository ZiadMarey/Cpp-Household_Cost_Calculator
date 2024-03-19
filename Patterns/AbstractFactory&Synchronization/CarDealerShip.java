import java.util.List;

public class CarDealerShip{

    CarPartFactory partFactory;
    CarDealerShip(CarPartFactory partFactory){
        this.partFactory = partFactory;
    }
    public Car Order(Color carColor, Color seatColor){
        Car mclarenSenna = new Car(partFactory.buildEngine(), List.of(partFactory.buildSeat(seatColor),partFactory.buildSeat(Color.BLUE)),Color.BLUE,true);
        return mclarenSenna;
    }
}
