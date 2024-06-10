package RS_tut;

import java.sql.SQLOutput;
import java.util.Scanner;

public class RS_03_InputInJava {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);    // System.in read from keyboard. sc is an object for Scanner.

        System.out.print("Enter your name: ");
        String a = sc.nextLine();

        System.out.print("Enter you password: ");
        String b = sc.next();

        System.out.println(a+"'s password is "+b);


    }
}
