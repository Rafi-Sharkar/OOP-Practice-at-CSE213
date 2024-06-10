package RS_tut;

public class RS_12_PracticeSet_03 {
    public static void main(String[] args) {
//        Problem 1
        String name = "Rafi Sharkar";
        System.out.println(name);

//        Problem 2
        String text = "To Lower Case";
        text = text.replace(" ", "_");
        System.out.println(text);

//        Problem 3
        String letter = "Dear <|name|>, Thanks a lot!";
        letter = letter.replace("<|name|>","Rafi Sharkar");     // without assigning the letter it doesn't work.
        System.out.println(letter);

//        Problem 4
        String myS = "This string contains  double and   triple spaces";
        System.out.println(myS);
        System.out.println(myS.indexOf("  "));
        System.out.println(myS.indexOf("   "));

//        Problem 5
        String letter_2 = "Dear Rafi,\n\tIt\'s a joss java tut.\n\\Thanks!\\";
        System.out.println(letter_2);

    }
}
