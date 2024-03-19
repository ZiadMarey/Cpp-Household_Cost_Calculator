public class Color {

    public byte blue;
    public byte green;
    public byte red;

    public Color(byte blue, byte green, byte red) {
        this.red = red;
        this.green = green;
        this.blue = blue;
    }

    public byte getBlue() {
        return this.blue;
    }

    public byte getGreen() {
        return this.green;
    }

    public byte getRed() {
        return this.red;
    }

    public void setBlue(byte blue) {
        this.blue = blue;
    }

    public void setGreen(byte green) {
        this.green = green;
    }

    public void setRed(byte red) {
        this.red = red;
    }


    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        } else if (obj instanceof Color) {
            {
                Color color1 = (Color) obj; // here we upcast obj to Color type and store it in a variable color1 of type Color
                return (blue == color1.blue) && (red == color1.red) && (green == color1.green);
            }
        } else {
            return false;
        }
//compare any object to the "obj" , 1st check if they are exactly the same , second check if they are of the same type

    }
    public int hashCode(){
        int result = Integer.hashCode(this.blue);
        result = 31 * result + Integer.hashCode(this.green);
        result = 31 * result + Integer.hashCode(this.red);
        return result;
    }
    public Color (Color point1){
        blue = point1.blue;
        red = point1.red;
        green = point1.green;
    }
    public Color clone(){
        try{
            return(Color) super.clone();
        }catch(CloneNotSupportedException e){
            throw new AssertionError();
        }
    }
}
