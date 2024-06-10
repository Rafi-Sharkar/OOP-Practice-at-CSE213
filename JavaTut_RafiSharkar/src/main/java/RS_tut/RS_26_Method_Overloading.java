package RS_tut;

/*
In case of Arrays, The reference is passed. some is the case for object passing to methods.
If we add parameter in same name methode then that is overloaded.


*** below 4lines are overloaded(at overloading process only matter parameter)
void bro()
void bro(int a )
void bro(int a, int b)
void bro(int a, int b, int c)

but

int bro(int a) // is not overloaded.


 */

public class RS_26_Method_Overloading {
/*
    static void tellJoke(){
        System.out.println("Rafi Sharkar");
    }

    static void change(int a ){
        a = 99;
    }
    static void changeArr(int [] arr){
        arr[0] = 99;
    }
*/

    static void broo() {
        System.out.println("Good morning" + "Bro!");
    }

    static void broo(int a) {
        System.out.println("Good morning" + a + "Bro!");
    }


    public static void main(String[] args) {

//        tellJoke();
        int[] marks = {53, 23, 62, 16, 66, 12, 54};  // there marks carry the refferenc of the array.
        int x = 77;     // here x is the not carring the refferenc.
//        change(x);
//        changeArr(marks);
//        System.out.println("The value of x after running change is - " + x);
//        System.out.println("The value of x after running change is - " + marks[0]);


    }
}


