import java.util.ArrayList;
import java.util.List;

public class Engine {

    public Engine(){}
    private double size;
    private List<Piston> pistons = new ArrayList<Piston>();

    public List<Piston> getPistons(){
        return this.pistons;
    }
    public void setPistons(List<Piston> piston){
        this.pistons = piston;
    }
    public double getSize(){
        return this.size;
    }
    public void setSize(double size){
        this.size = size;
    }

}
