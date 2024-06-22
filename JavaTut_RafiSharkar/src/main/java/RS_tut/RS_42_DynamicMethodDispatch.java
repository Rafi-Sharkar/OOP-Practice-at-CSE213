package RS_tut;

/*
    It's also runtime polimorphysm == Dynamic Method Dispatch
 */

class One{
    public void greet(){
        System.out.println("Good Morning");
    }
    public void name(){
        System.out.println("My name is Java");
    }
}

class Two extends One{
    public void welcome(){
        System.out.println("Welcome to my house ! ");
    }
    public void name(){
        System.out.println("My name is Java in Class two");
    }
}

public class RS_42_DynamicMethodDispatch {
    public static void main(String[] args) {
        One obj1 = new One();
        Two obj2 = new Two();

        One obj3 = new Two();       // obj3's object reff comes from super class and object comes from subclass
//        Two obj4  = new One();        // it's not possible.
    }
}
