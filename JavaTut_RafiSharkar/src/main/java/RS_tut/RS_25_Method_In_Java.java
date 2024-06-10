package RS_tut;

/*
Method == Fanction

mathod is a function which exist in class;
Stucture of Method___

datatype mathod_name (arguments){
    Statement;
    return ;
    }

* if main method is static then you can call only static method(without makeing any object) into main method;
if we use static then then we don't need to make a object for called the method;

** Static is for common methode, just like hostel refrigerator
** Without static is personal refrigerator, We have to access there with refferencing student(Class name in code)

otherwise we have to make a object with class name;



 */

public class RS_25_Method_In_Java {
//  Logic
    static int logic(int x, int y){     // parameter are copy by reference.
        int z;
        if (x>y){
            z = x+y;
        }else {
            z = (x+y)*5;
        }
        return z;
    }
//    Logic1
    int logic1(int x, int y){
        int z;
        if (x>y){
            z = x+y;
        }else {
            z = (x+y)*5;
        }
        return z;
    }

    public static void main(String[] args) {
        int a=5, b=7, c, c1;
//      logic
        c = logic(a,b);
//      logic1
        RS_25_Method_In_Java lg1 = new RS_25_Method_In_Java();
        c1 = lg1.logic1(a,b);

        System.out.println("result of Logic: Logic1 is "+ c +" "+ c1);

    }

}
