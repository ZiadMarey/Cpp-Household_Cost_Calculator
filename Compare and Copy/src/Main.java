public class Main {
    public static void main(String[] args) {
        Point point1 = new Point(1,2);
        Point point2 = new Point(2,2);
        System.out.println(point1.equals(point2)); // if Point1 is of type Point, then it will call equals method we overrode in
                                                // the Point class, if it is not, then it will call the default equals method
        System.out.println(point1.hashCode());
        Point point3 = new Point(point1); // this is the copy constructor
        Point point4 = point1.clone();
        System.out.println(point4.hashCode());// testing the clone

    }
}
