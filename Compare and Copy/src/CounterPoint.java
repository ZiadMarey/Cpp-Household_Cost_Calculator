public class CounterPoint implements Cloneable{

    Point point;
        public static int counter;
        public CounterPoint (int x, int y) {
            point = new Point(x,y);
            counter++;
        }

    public boolean equals(Object obj){
            if(this == obj){
                return true;
            } else if(obj instanceof CounterPoint){
                CounterPoint counterPoint = (CounterPoint) obj;
                return(this.point.equals(counterPoint.point));
            } else {return false;}
    }

    public CounterPoint clone(){
            try{
                return(CounterPoint) super.clone();
            } catch (CloneNotSupportedException e){
                throw new AssertionError();
            }
    }
}