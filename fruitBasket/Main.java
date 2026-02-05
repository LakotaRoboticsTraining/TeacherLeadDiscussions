package fruitBasket;

import fruitBasket.model.Apple;
import fruitBasket.model.Banana;
import fruitBasket.model.Orange;

public class Main {
    public static void main(String[] args) {

        Fruit Banana = new Banana("Yellow","Big","Creamy");
        Fruit Apple = new Apple("Red", "Medium", "Sweet");
        Fruit Orange = new Orange();


        System.out.println(Banana);
        System.out.println(Apple);
        System.out.print(Orange);
    }
}