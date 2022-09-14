public abstract class Bird implements Flyable{
    private double wingSize;
    private double weight;
    private double height;
    public Bird(){};
    public Bird(double wingSize, double weight, double height){
       this.wingSize = wingSize;
       this.weight = weight;
       this.height = height;
    }
    public void eat(double food){
        
    }
    public void setWingSize(double wingSize){
        this.wingSize += wingSize;
    }
    public double getWingSize(){
        return wingSize;
    }
    public void setWeight(double weight){
        this.weight += weight;
    }
    public double getWeight(){
        return weight;
    }
    public void setHeight(double height){
        this.height += height;
    }
    public double getHeight(){
        return height;
    }
}