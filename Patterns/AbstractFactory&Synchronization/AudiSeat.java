public class AudiSeat implements Seat {
    Color color;

    AudiSeat(Color color){
        this.color = color;
    }
    @Override
    public Color getColor() {
        return this.color;
    }
}
