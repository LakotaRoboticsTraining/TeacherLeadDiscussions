package fruitBasket.model;

public class Apple extends Fruit{


    public Apple(){

    }

    public Apple(String color, String size, String taste){
        super(color, size, taste);
    }

    public void peel(String tool){
        System.out.println("You peeled me with your " + tool);
    }

    @Override
    public void peel(){
        this.peel("Knife");
    }


    @Override
    public String toString(){
        return super.toString();
    }
}
