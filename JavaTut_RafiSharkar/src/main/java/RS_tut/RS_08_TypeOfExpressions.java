package RS_tut;

/*
    Resulting data type after arithmetic operation
    --> Following table summarizes the resulting data types after arithmetic operation on them.

    b -> byte;  f -> float;
    s -> short; d -> double;
    i -> int; c -> character;
    l -> long;

    resulting combinations are___
    b+s=i;  s+i=i;  l+f=f;  i+f=f;  c+i=i;  c+s=i;  l+d=d;  f+d=d;
 */

public class RS_08_TypeOfExpressions {
    public static void main(String[] args) {
        /*
        int a = 654 + 6;    // int + int = int
        float b = 6.56f + 4;    //float + int = float
        System.out.println(b);
         */

        // Increment and Decrement Operators
        int i = 56;
        System.out.println(i++);    // print i and increment
        System.out.println(i);
        System.out.println(++i);    // increment and print
        System.out.println(i++);
        System.out.println(i);
        System.out.println(++i *3);

        char c = 'a';
        System.out.println(++c);

    }
}
