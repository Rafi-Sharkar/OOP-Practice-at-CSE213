package RS_tut;

import java.util.Random;
import java.util.Scanner;

public class RS_34_Rock_Paper_Scissor {
    public static void main(String[] args) {
        System.out.println("(0 for Rack __ 1 for Paper __ 2 for Scissor)");
        System.out.print("choose one___");

        Scanner sc = new Scanner(System.in);
        int user = sc.nextInt();

        Random random = new Random();
        int comp = random.nextInt(0,3);
        
        if (user == comp){
            System.out.println("Draw !!!");
        } else if (user == 0 && comp == 2 || user == 1 && comp == 0 || user == 2 && comp == 1){
            System.out.println("You win!!!");
        }else {
            System.out.println("You lose");
        }
    }
}
