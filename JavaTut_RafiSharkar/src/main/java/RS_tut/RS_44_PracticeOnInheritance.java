package RS_tut;

class Circle{
    public int radius;

    Circle(int r){
        System.out.println("I am circle parameterized constructor");
        this.radius = r;
    }
    public double area(){
        return Math.PI*this.radius*this.radius;
    }
}

class Cylinder1 extends Circle{
    public int height;

    Cylinder1(int r, int h){
        super(r);       // super is immediate parent class
        this.height = h;
        System.out.println("I am cylinder1 parameterized constructor!!");
    }

    public double volume(){
        return Math.PI*this.radius*this.radius*this.height;
    }
}

public class RS_44_PracticeOnInheritance {
    public static void main(String[] args) {
        //  Problem 01: Create a class Circle and use inheritance to create another class Cylinder from it.
//        Circle objC = new Circle(12);
        Cylinder1 obj = new Cylinder1(12, 3);
    }
}
