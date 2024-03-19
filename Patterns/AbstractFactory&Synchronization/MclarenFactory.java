public class MclarenFactory implements CarPartFactory {

    @Override
    public Engine buildEngine(){
        Engine mclarenEngine = new MclarenEngine(8,20,5);
        return mclarenEngine;
    }

    @Override
    public Seat buildSeat(Color color) {
        Seat mclarenSeat = new MclarenSeat(color);
        return mclarenSeat;
    }

}
