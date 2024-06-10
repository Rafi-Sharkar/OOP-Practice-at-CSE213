package RS_tut;

import java.util.Scanner;

public class RS_05_PracticeSet_01 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Practise Set 01");
        System.out.println("\t Question_01: Write a program to sum three number in java.");

        int x = 48;
        int y = 39;
        int z = 44;
        int sum = x+y+z;
        System.out.println("\t\t ans: Sum to "+ sum);

        System.out.println("\t Question_02: Write a program to calculate CGPA using marks of three subjects (out of 100)");

        float sub1 = 69;
        float sub2 = 88;
        float sub3 = 81;
        float cgpa = (sub1 + sub2 + sub3)/30;

        System.out.println("\t\t ans: cgpa is "+ cgpa);

        System.out.println("\t write a java program which asks the user to enter his/her name and greet them with 'Hello <name>, have a good day' text");

        System.out.print("\t\tEnter your name: ");
        String name = sc.nextLine();
        System.out.println("\t\tHello "+name+", have a good day.");

        System.out.println("\t Write a java program to convert Kilometer to mile");
        System.out.print("\t\tEnter Kilometer: ");
        float km = sc.nextFloat();
        float mile = km*.621371f;
        System.out.println("\t\t mils = "+mile);

        System.out.println("\t Write a java program which detect that taken number is int or not");
        System.out.print("\t\tEnter number: ");
        Scanner sc1 = new Scanner(System.in);       // by this we don't have to declare data type
        System.out.println("\t\t"+sc1.hasNextInt());

    }
}
