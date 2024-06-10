package RS_tut;

import java.util.Random;
import java.util.Scanner;

public class RS_16_PracticeSet_4 {
    public static void main(String[] args) {
//      Question 1
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your marks in Math: ");
        float math = sc.nextFloat();
        System.out.print("Enter your marks in Physics: ");
        float phy = sc.nextFloat();
        System.out.print("Enter your marks in Chemistry: ");
        float che = sc.nextFloat();

        float avg = (math+phy+che)/3.0f;
        if (avg>=40 && math>=33 && phy>=33 && che>=33){
            System.out.println("Congratulations, You have been promoted!!");
        }else {
            System.out.println("Sorry, You have not been promoted");
        }

//        Question 2
        float tax = 0;
        System.out.print("Enter your income in lac: ");
        float income = sc.nextFloat();
        if(income < 3.3f){
            tax = tax + 0;
        } else if (3.3f < income && income < 5.5f) {
            tax = tax + .05f * (income-3.3f);
        } else if (income < 5.5f && income < 8.5f) {
            tax = tax + .05f * (5.5f - 3.3f);
            tax = tax + .1f * (income -5.5f);
        } else if (income> 8.5f) {
            tax = tax + .05f * (5.5f - 3.3f);
            tax = tax + .1f * (8.5f - 5.5f);
            tax = tax + .15f * (income - 8.5f);
        }
        System.out.printf("Your valid tax is %f lac", tax);

//        Question 3
        int day = sc.nextInt();
        switch (day){
            case 1 -> System.out.println("Saturday");
            case 2 -> System.out.println("Sunday");
            case 3 -> System.out.println("Monday");
            case 4 -> System.out.println("Tuesday");
            case 5 -> System.out.println("Wednesday");
            case 6 -> System.out.println("Thursday");
            case 7 -> System.out.println("Friday");
        }
//        Question 4
        String website = sc.next();
        if (website.endsWith(".org")){
            System.out.println("This is an organizatioinal website");
        } else if (website.endsWith(".com")) {
            System.out.println("This is a commersial website");
        } else if (website.endsWith(".bd")) {
            System.out.println("This is a Bangladeshi website");
        } else if (website.endsWith(".gov")) {
            System.out.println("This is a government website");
        }

    }
}
