package fruitBasket;

import fruitBasket.model.Apple;
import fruitBasket.model.Banana;
import fruitBasket.model.Orange;
import fruitBasket.model.Fruit;
import fruitBasket.model.FruitBasket;

public class Main {
    public static void main(String[] args) {

        FruitBasket fruitBasket = new FruitBasket();

        Fruit banana = new Banana("Yellow","Big","Creamy");
        Fruit apple = new Apple("Red", "Medium", "Sweet");
        Fruit orange = new Orange("Orange", "Small", "Tangy");

        fruitBasket.add(banana);
        fruitBasket.add(apple);
        fruitBasket.add(orange);

        for (Fruit fruit : fruitBasket.getFruitList()) {
            System.out.println(fruit.getClass().getSimpleName() + ": " + fruit.getSize());
            fruit.peel(); 
        }

        System.out.println(fruitBasket);

        fruitBasket.remove(apple);

        System.out.println(fruitBasket);
    }
}