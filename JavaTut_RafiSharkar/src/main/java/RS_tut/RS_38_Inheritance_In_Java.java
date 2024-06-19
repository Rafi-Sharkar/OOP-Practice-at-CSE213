package RS_tut;

/*
    When a class inherits from a superclass, it inherits parts of superclass methods and fields. Java doesn't support multiple inheritance is two classes cannot be super classes for subclass.
 */

class Base{
    int x;

    public int getX() {
        return x;
    }
    public void setX(int x){
        this.x = x;
    }
    public void printMe(){
        System.out.println("I am a constructor");
    }
}

class Derived extends Base{         // Derived is son of Base
    int y;

    public void setY(int y) {
        this.y = y;
    }
    public int getY() {
        return y;
    }
}

public class RS_38_Inheritance_In_Java {
    public static void main(String[] args) {
        Base b = new Base();        // parent class
        b.setX(4);
        System.out.println(b.getX());

        Derived b1 = new Derived();         // child class
        b1.setX(2);
        System.out.println(b1.getX());
    }
}
