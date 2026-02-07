package fruitBasket.model;

public class Orange {
    public String color;
    public String size;
    public String taste;

    public Orange(){

    }

    public Orange(String color, String size, String taste){
        this.color = color;
        this.size = size;
        this.taste = taste;
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

    @Override
    public String toString(){
        return "I'm an Orange, I'm " + color + ", I'm " + size + " size, and I taste" + taste;
    }
}
