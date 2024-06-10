package RS_tut;

// String is a class. we can change it after declaring. String is immutable.

/*
there have 4 type of print.
1. System.out.print()       // don't take \n at the end.
2. System.out.println()     // take \n at the end.
3. System.out.printf()      // it's a format specifier. %d for int, %f for float{%4.3f ==> ____.___ space declatetion}, %c for char, %s for string.
    int a=6;
    float b=5.645f;
    System.out.printf("The value of a is %d and value of b is %f", a, b);
    return-> The value of a is 6 and value of b is 5.645000
4. System.out.format()
 */

import java.sql.SQLOutput;
import java.util.Scanner;

public class RS_10_IntroToStrings {
    public static void main(String[] args) {
//        String name = new String("Rafi Sharkar");     // there create a new address for name.
//        String name = "Rafi";    // there will not create a permanent object for name
//        System.out.println(name);

//        int a=6;
//        float b=5.645f;
//        System.out.printf("The value of a is %d and value of b is %f", a, b);
//        System.out.println();
//        System.out.format("The value of a is %d and value of b is %f", a, b);

        Scanner sc = new Scanner(System.in);
//        String st = sc.next();      // Take the first string only;
        String st = sc.nextLine();      // Take the hole line;
        System.out.println(st);


    }
}
