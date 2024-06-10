package RS_tut;

/*
Break statement___
    --> The break statement is used to exit the loop irrespactive of wheather the condition is true of false.
Continue statement___
    --> The continue statement is used to immideately move to the next iteration of the loop irrespactive of wheather the condition is true of false.
 */

public class RS_20_BreakAndContinue {
    public static void main(String[] args) {
//        Break and continue using loop!
        for (int i=0; i<10; i++){
            System.out.println(i);
            System.out.println("Java is great");
            if (i == 2){
                System.out.println("Ending the loop");
                break;
            }
        }
    }
}
