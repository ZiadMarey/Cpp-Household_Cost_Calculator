public interface Shape {
    public double getSurface();
    public void move(int x, int y);
}
//2 types of composites:
// 1- type saftey: every leaf has the methods in the composite BUT it might have more methods
// 2- uniformity forces to make all classes have the same exact methods not matter if they are leafs or composites