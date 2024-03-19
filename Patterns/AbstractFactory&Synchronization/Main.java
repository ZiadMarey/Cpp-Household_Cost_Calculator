public class Main {
    public static void main(String[] args) {
        CarPartFactory mclarenFactory = new MclarenFactory();
        CarDealerShip mclarenGroup = new CarDealerShip(mclarenFactory);
        mclarenGroup.Order(Color.BLUE,Color.BLACK);
    }
}
