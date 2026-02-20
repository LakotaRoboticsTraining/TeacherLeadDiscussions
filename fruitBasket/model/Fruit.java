package fruitBasket.model;

public abstract class Fruit {

    private String color;
    private String size;
    private String taste;

    public Fruit(String color, String size, String taste){
        this.color = color;
        this.size = size;
        this.taste = taste;
    }

    public Fruit() {

    }

    public String getSize(){
        return this.size;
    }

    public String getColor(){
       return this.color;
    }
    
    public String getTaste(){
      return this.taste;
    }

    public abstract void peel();

    @Override
    public String toString(){
        return "I'm an " + this.getClass().getSimpleName() + ", " + "I'm " + this.color + ", I'm " + this.size + " size, and I taste " + this.taste;
    }
}
