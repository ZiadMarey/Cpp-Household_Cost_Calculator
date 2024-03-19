import static java.lang.Math.pow;

public class Circle implements Shape{
    private int x;
    private int y;
    private int radius;


    public Circle(int x, int y, int radius){
        this.x = x;
        this.y = y;
        this.radius = radius;
    }

    public int getX(){
        return this.x;
    }
    public int getY(){
        return this.y;
    }
    public int getRadius(){
        return this.radius;
    }
    public void setX(int x){
        this.x = x;
    }
    public void setY(int y){
        this.y=y;
    }
    public void setRadius(int radius){
        this.radius = radius;
    }
    public void move(int x,int y){
        this.x = x;
        this.y = y;
    }

    @Override
    public double getSurface() {
        return 3.14 * pow(radius,2);
    }
}
