package RS_tut;

import java.sql.SQLOutput;

public class RS_11_StringMethods {
    public static void main(String[] args) {
        String name = "Rafi Sharkar";
        System.out.println(name);

        int value = name.length();
        System.out.println(value);

        String lcs = name.toLowerCase();
        System.out.println(lcs);

        String ucs = name.toUpperCase();
        System.out.println(ucs);

        String nonTrimmedString = "     Rafi            ";
        System.out.println(nonTrimmedString);
        System.out.println(nonTrimmedString.trim());

        System.out.println(name.substring(2,7));

        System.out.println(name.replace('r', 'a'));

        System.out.println(name.startsWith("Ra"));
        System.out.println(name.endsWith("Ra"));

        System.out.println(name.charAt(5));

        System.out.println(name.indexOf("ar",8));   // take the first occarenc

        System.out.println(name.lastIndexOf("ar",8));   // invert of indexOf() method

        System.out.println(name.equals("rafi sharkar"));

        System.out.println(name.equalsIgnoreCase("rafi sharkar"));

      /*
      Escape sequence characters
        examples: "\n"--> new line;
                  "\t"--> Tab;
                  "\'"--> single quote;
                  "\\"--> backslash;

       */
    }
}
