import java.util.ArrayList;
import java.util.List;

public class ShapeGroup implements Shape {
    public int x;
    public int y;
    List<Shape> shapes = new ArrayList<Shape>();
    void addshape(Shape shape){ // objects of type Shape, is everything that implements Shape interface
        shapes.add(shape);
    }
    void remove(Shape shape){
        shapes.remove(shape);
    }
    Shape getElement(int index){
        return shapes.get(index);
    } // return something that implements the Shape interface
    @Override
    public double getSurface() { // The job of this is to sum up all indvidual surfaces of shapes
        double sum = 0;
        for(int i = 0; i<shapes.size();i++){
            sum += shapes.get(i).getSurface();
        }
        return sum;
    }

    @Override
    public void move(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
