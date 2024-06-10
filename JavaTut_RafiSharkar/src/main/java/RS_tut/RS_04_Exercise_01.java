package RS_tut;

import java.util.Scanner;

public class RS_04_Exercise_01 {
    public static void main(String[] args) {

        Scanner sc = new  Scanner(System.in);

        System.out.print("Enter marks of Bangla: "); int ban = sc.nextInt();
        System.out.print("Enter marks of English: "); int eng = sc.nextInt();
        System.out.print("Enter marks of Math: "); int math = sc.nextInt();
        System.out.print("Enter marks of Physics: "); int phy = sc.nextInt();
        System.out.print("Enter marks of Chemistry: "); int chy = sc.nextInt();
        System.out.print("Enter marks of Biology: "); int bio = sc.nextInt();

        System.out.println("Total avg marks is "+ ((ban+eng+math+phy+chy+bio)/6));
    }
}
