package fruitBasket.model;

public class Orange extends Fruit{

    public Orange(){
        super();
    }

    public Orange(String color, String size, String taste){
        super(color,size,taste);
    }

    @Override
    public void peel(){
        System.out.println("You peeled me with your bare hands");
    }

    @Override
    public String toString(){
        return super.toString();
    }
}
