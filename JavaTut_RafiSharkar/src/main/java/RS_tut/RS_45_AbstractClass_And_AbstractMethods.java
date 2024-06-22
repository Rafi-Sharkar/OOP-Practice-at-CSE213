package RS_tut;

/*
    Abstract Class and it's methods make a standard form for Project. We can create an object of abstract class. It's a blueprint of its child classes

    Abstract is imaginary__
    => existing in thought or as an idea without concrete existence.

    Abstract methods__
    => A method that is declared without an implementation.
    ex: abstract void modeTo(double x, double y);

    Abstract class__
    If a class includes abstract methods, then the class itself must be declared abstract, as in :
        public abstract class PhoneModel{
            abstract void switchOff();
            // more code
            }
 */

abstract class Parent{      //
    public  Parent(){
        System.out.println("I am the constructor of Parent class");
    }
    public void sayHello(){
        System.out.println("Hello");
    }
    abstract public void greet();       // by this abstraction Parent class want to tall it's child class to override this method and make change as you wish.

    abstract public void greet1();
}

class Child extends Parent{
    @Override
    public void greet(){
        System.out.println("Good morning :-) ");
    }
    public void greet1(){
        System.out.println("Good evening !!");
    }
}
//class Child1 extends Parent{            // in child classes we have to use all abstract methods.
//    public void greet(){
//        System.out.println("I am good ");
//    }
//}
abstract class Child2 extends Parent{
//    public void greet(){
//        System.out.println("this is abstract class in site abstract class.");
//    }
    abstract  void greet3();
}

public class RS_45_AbstractClass_And_AbstractMethods {
    public static void main(String[] args) {
//        Parent p = new Parent();      // it recommend a structure to create or modify this class's methods
        Child c = new Child();
//        Child1 c1 = new Child1();
        Child2 c2 = new Child2() {
            @Override
            void greet3() {
                System.out.println("change 1");
            }
            @Override
            public void greet() {
                System.out.println("Change 2");
            }
            @Override
            public void greet1() {
                System.out.println("Change 3");
            }
        };      // in there un modified methods comes to get change as recommendation.

    }
}
