public abstract class CarFactory implements Car{
    abstract public Car build(Color carColor, Color seatColor);
    public Car order(Color carColor, Color seatColor){
       return build(carColor,seatColor);

    }

}
