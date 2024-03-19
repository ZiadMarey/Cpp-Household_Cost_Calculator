import static java.lang.Math.pow;


// uniformity means that every leaf implement the same methods
public class Rectangle implements Shape{
    private int x;
    private int y;
    private int width;
    private int height;


    public Rectangle(int x, int y, int width,int height){
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public int getX(){
        return this.x;
    }
    public int getY(){
        return this.y;
    }
    public int getWidth(){
        return this.width;
    }
    public int getHeight(){
        return this.height;
    }
    public void setX(int x){
        this.x = x;
    }
    public void setY(int y){
        this.y=y;
    }
    public void setWidth(int width){
        this.width = width;
    }
    public void setHeight(int height){
        this.height = height;
    }

    public void move(int x,int y){
        this.x = x;
        this.y = y;
    }

    @Override
    public double getSurface() {
        return this.width * this.height;
    }
}
