public class Point implements Cloneable {

    public int x;
    public int y;

    public Point(int x, int y){
        this.x = x;
        this.y = y;
    }
    public int getY(){
        return this.y;
    }
    public int getX(){
        return this.x;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj){
            return true;
        } else if(obj instanceof Point) {
            {
                Point point1 = (Point) obj; // here we upcast obj to Point type and store it in a variable point1 of type Point
                return(x == point1.x) && (y == point1.y);
            }
        }else {return false;}
//compare any object to the "obj" , 1st check if they are exactly the same , second check if they are of the same type
    }

    public int hashCode(){
        int result = Integer.hashCode(this.x);
        result = 31 * result + Integer.hashCode(this.y);
        return result;
    }

    public Point(Point point1){
        x = point1.x;
        y = point1.y;
    }

    public Point clone(){
        try{
            return (Point) super.clone();
        } catch (CloneNotSupportedException e){
            throw new AssertionError();
        }
    }




}
