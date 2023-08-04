import java.util.ArrayList;

public class Box <T extends Fruit>{
    private String name;
    private ArrayList<T> boxFruits = new ArrayList<>();



    public Box(String name) {
        this.name = name;
    }

    public double getWeight(){
        double weight = 0.0;
        for (T fruit : boxFruits){
            weight+=fruit.getWeight();
        }
        return weight;
    }
    public void addFruit(T fruit) {
        boxFruits.add(fruit);
    }

    @Override
    public String toString() {
        String msg= name+" ";
        for (Fruit fruit : boxFruits){
            msg+=fruit+" ";
        }
        return msg+" size:"+boxFruits.size();
    }

    public boolean compare(Box<?> otherBox){
        if (this.getWeight() != otherBox.getWeight()) return false;
        else return true;
    }

    public void pour(Box<T> otherBox){
        for (T fruit : boxFruits){
            otherBox.addFruit(fruit);
        }
        boxFruits.clear();
    }


}
