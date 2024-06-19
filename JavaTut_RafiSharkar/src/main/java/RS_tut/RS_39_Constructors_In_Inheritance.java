package RS_tut;

class Base1{
    Base1(){
        System.out.println("I am a constructor of Base1");
    }
    Base1(int x){
        System.out.println("I am overloaded constructor of Base1 with value of x as  "+ x);
    }
}

class Derived1 extends Base1{
    Derived1(){
        System.out.println("I am constructor of Deried1");
    }
    Derived1(int x, int y){
        super(x);
        System.out.println("I am overloaded constructor of Derived with value of y as: "+ y);
    }
}

class ChildOfDerived extends Derived1{
    ChildOfDerived(){
        System.out.println("I am constructor of ChildOfDerived");
    }
    ChildOfDerived(int x, int y, int z){
        super(x,y);     // take x , y to super class
        System.out.println("I am overloaded constructor of ChildOfDerived with value of z as: "+ z);
    }
}

public class RS_39_Constructors_In_Inheritance {
    public static void main(String[] args) {
//        Base1 b = new Base1();
//        Derived1 d = new Derived1();
//        ChildOfDerived cd = new ChildOfDerived();
        ChildOfDerived cd1 = new ChildOfDerived( 2,3,4);


    }
}
