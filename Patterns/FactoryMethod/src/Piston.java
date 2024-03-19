import java.io.Serializable;

public class Piston implements Serializable {

    private double thickness;

    public double getThickness(){
        return this.thickness;
    }
    public void setThickness(double thickness){
        this.thickness = thickness;
    }

    public Piston(double thickness){
        this.thickness = thickness;
    }


}
