package RS_tut;

import java.util.Scanner;

public class RS_09_PractiseSet_02 {
    public static void main(String[] args) {
        System.out.println("Practice Set 2");
        System.out.println("\t What will be the result of the following expression float a=7/4*9/2");
        /*
        1.75 * 9/2
        1.75 * 4.5
        7.875
         */
        float a = 7/4.0f * 9/2.0f;
        System.out.println(a);

        System.out.println("Write a java program to encrypt a grade by adding 8 to it. Decrypt it to show thr correct grade.");
        // encryption
        char grade = 'B';
        grade = (char)(grade+8);
        System.out.println(grade);
        // decryption
        grade = (char) (grade-8);
        System.out.println(grade);

        System.out.println("\t Use comparison operators to find out whether a given number is greater than the user entered number or not");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int x = sc.nextInt();
        System.out.println(x>8);

        System.out.println("((v^2)-(u^2))/(2*o*p)");

        System.out.print("Enter v: ");
        float v = sc.nextFloat();
        System.out.print("Enter u: ");
        float u = sc.nextFloat();
        System.out.print("Enter o: ");
        float o = sc.nextFloat();
        System.out.print("Enter p: ");
        float p = sc.nextFloat();

        float result = ((v*v)-(u*u))/(2*o*p);
        System.out.println("\t\t result = "+ result);
    }
}
