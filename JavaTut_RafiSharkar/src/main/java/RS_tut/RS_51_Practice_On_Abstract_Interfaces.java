package RS_tut;

/*
Question__
    1. Create an abstract class Pen with methods write() and refill() as abstract methods.
    2. Use the pen class from Q1 to create a concrete class FountainPen with additional method changeNib().
    3. Create a class Monkey with jump() and bite() methods. Create a class Human which inherits this Monkey class and implements BaseAnimal interface with eat() and sleep() methods.
    4. Creta a class TelePhone with ring(), left() and disconnect() methods as abstract methods. Create another class SmartTelephone and demonstrate polymorphism.
    5. Demonstrate polymorphism using monkey class from Q3
 */
abstract class Pen{     // Q1
    abstract void write();
    abstract void refill();
}
class FountainPen extends Pen{      // Q2
    void write(){
        System.out.println("Write");
    }
    void refill(){
        System.out.println("Refill");
    }
    void changeNib(){
        System.out.println("Changing the nib");
    }
}

abstract class Monkey{
    void jump(){
        System.out.println("Juming...");
    }
    void bite(){
        System.out.println("Biting...");
    }
    abstract void run();
}
interface BasicAnimal{
    void eat();
    void sleep();
}
class Human extends Monkey implements BasicAnimal{
    void speak(){
        System.out.println("Hellow...");
    }
    @Override
    public void run(){
        System.out.println("running ....");
    }
    @Override
    public void eat(){
        System.out.println("Eating...");
    }
    @Override
    public void sleep(){
        System.out.println("Sleeping z.z.z...");
    }
}

public class RS_51_Practice_On_Abstract_Interfaces {
    public static void main(String[] args) {
//        Q1 + Q2
        FountainPen fpan = new FountainPen();
        fpan.changeNib();
//        Q3
        Human rafi = new Human();
        rafi.eat();
        rafi.bite();
        rafi.speak();
//        Q5
        Monkey m1 = new Human();
//        m1.speak();       // mankey has not speak()
        m1.bite();
        BasicAnimal ratul = new Human();
//        only can use BasicAnimal's methods
        ratul.eat();
    }
}
