package fruitBasket;

import fruitBasket.model.Apple;
import fruitBasket.model.Banana;
import fruitBasket.model.Orange;

public class Main {
    public static void main(String[] args) {

        Banana banana = new Banana("Yellow","Big","Creamy");
        Apple apple = new Apple("Red", "Medium", "Sweet");
        Orange orange = new Orange("Orange", "Small", "Tangy");

        System.out.println(banana);
        System.out.println(apple);
        System.out.println(orange);

        System.out.println(banana.getClass().getSimpleName() + ": " + banana.getSize());
        //banana.peel(); --We'll add this after creating abstract method in abstract parent
        System.out.println(apple.getClass().getSimpleName() + ": " + apple.getSize());
        //apple.peel(); --We'll add this after creating abstract method in abstract parent
        System.out.println(orange.getClass().getSimpleName() + ": " + orange.getSize());
        //orange.peel(); --We'll add this after creating abstract method in abstract parent
    }
}