public class MclarenSeat implements Seat {
    Color color;

    MclarenSeat(Color color){
        this.color = color;
    }
    @Override
    public Color getColor() {
        return this.color;
    }
}
