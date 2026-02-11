package fruitBasket.model;

import java.util.ArrayList;
import java.util.List;

public class FruitBasket {
    private List<Fruit> fruitList;

    public FruitBasket(){
        this.fruitList = new ArrayList<Fruit>();
    }

    public void add(Fruit fruit){
        this.fruitList.add(fruit);
    }

    public void remove(Fruit fruit){
        this.fruitList.remove(fruit);
    }

    public List<Fruit> getFruitList(){
        return this.fruitList;
    }

    public int getFruitCount(){
        return this.fruitList.size();
    }

    @Override
    public String toString(){
        String str = this.getClass().getSimpleName() + ": [ \n";
        for (Fruit fruit : fruitList) {
            str = str + " " + fruit + "\n ";
        }

        str = str.concat("]");

        return str;
    }
}
