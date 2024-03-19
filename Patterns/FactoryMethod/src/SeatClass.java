public class SeatClass implements Seat{

    Color seatColor;
    SeatClass (Color color){
        seatColor = color;
    }

    @Override
    public Color getColor() {
        return seatColor;
    }
}
