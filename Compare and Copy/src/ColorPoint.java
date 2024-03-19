public class ColorPoint implements Cloneable {

    public Color color;

    public Point point;

    public ColorPoint (int x, int y, byte blue, byte red, byte green){
        Point point = new Point(x,y);
        Color color = new Color(blue,green,red);

    }
    public boolean equals(Object obj){
        if(this == obj){
            return true;
        }
        else if(obj instanceof ColorPoint) {
            ColorPoint point2 = (ColorPoint) obj;
            return (this.point.equals(point2.point) && this.color.equals(point2.color)); // take each attribute (Color & Point) and compare them to each other in this way
                                                    // anything int with == and anything else with .equals() method we overrode in Point class , like we did in line 17
        } else {return false;}

        }

    public ColorPoint (ColorPoint point1){

        color = new Color(point1.color.blue, point1.color.green,point1.color.red);
        point = new Point(point1.point.x,point1.point.y);

        color.blue = point1.color.blue;
        color.red = point1.color.red;
        color.green = point1.color.green;
        point.x = point1.point.x;
        point.y = point1.point.y;
    }

    public ColorPoint clone(){
        try {
            return (ColorPoint) super.clone();

        } catch (CloneNotSupportedException e){
            throw new AssertionError();
        }

    }

}

