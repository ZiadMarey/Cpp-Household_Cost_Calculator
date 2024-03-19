public abstract class Bird {

    private String Name;
    private int age;

    private float weight;

    public void setName(String Name){
        this.Name = Name;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void setWeight(float weight){
        this.weight = weight;
    }
    public String getName(){
        return this.Name;
    }
    public int getAge(){
        return this.age;
    }
    public float getWeight(){
        return this.weight;
    }
    public void eatFood(){};

}
