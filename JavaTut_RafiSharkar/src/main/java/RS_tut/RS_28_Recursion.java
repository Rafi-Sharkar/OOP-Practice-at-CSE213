package RS_tut;

/*
A function is java can call itself. Such calling of function by itself is called recursion.
 */

public class RS_28_Recursion {

    static int factorial(int n){
//        factorial(n) = n * n-1 * n-2 * ... * 1
//        factorail(3) = 3*2*1 = 6
        if(n==0 || n==1){
            return 1;
        }else {
            return n*factorial(n-1);
        }

    }

    public static void main(String[] args) {
        int x=4;
        System.out.println("The value of factorial "+x+" is "+factorial(x));
    }
}
