package RS_tut;

/*
In else if all condition will check serially. and if one will true then it don't go forward.
In switch any case will match then all case will be exicute after that. To avoide this porblem we use brack statement. And default not mendetory for this but sometime default will neccessry to aboide error.
 */

import java.util.Scanner;

public class RS_15_else_ifAndSwitchCase {
    public static void main(String[] args) {

//  else if
        System.out.print("Enter your year of experient: ");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if(age>15){
            System.out.println("Expert");
        } else if (age>10) {
            System.out.println("Semi expert");
        } else if (age > 5) {
            System.out.println("Senior");
        } else {
            System.out.println("Junior");
        }

//  Switch condition
        int day = 4;
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
        }
    }
}
