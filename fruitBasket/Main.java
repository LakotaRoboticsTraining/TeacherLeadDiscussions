package fruitBasket;

import fruitBasket.model.Apple;
import fruitBasket.model.Banana;
import fruitBasket.model.Orange;
import fruitBasket.model.Fruit;

public class Main {
    public static void main(String[] args) {

        Fruit banana = new Banana("Yellow","Big","Creamy");
        Fruit apple = new Apple("Red", "Medium", "Sweet");
        Fruit orange = new Orange("Orange", "Small", "Tangy");

        System.out.println(banana);
        System.out.println(apple);
        System.out.println(orange);

        System.out.println(banana.getClass().getSimpleName() + ": " + banana.getSize());
        banana.peel(); 
        System.out.println(apple.getClass().getSimpleName() + ": " + apple.getSize());
        apple.peel(); 
        System.out.println(orange.getClass().getSimpleName() + ": " + orange.getSize());
        orange.peel(); 
    }
}