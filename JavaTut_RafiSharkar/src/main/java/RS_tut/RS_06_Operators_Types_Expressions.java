package RS_tut;

/*
 2(operand) +(operator) 3(operand) = 5(result)

 --> Arithmetic --> +, -, *, /, %, ++, --
 --> Assignment --> =, +=
 --> Comparison --> ==, >=, <=
 --> Logical --> &&(AND), ||(OR), !(NOT)
 --> Bitwise --> &(AND), |(OR)

   10
 & 11
--------    0 & 1 = 0 , 1 & 1 = 1
   10
 ** Arithmetic operators cannot work with booleans
 ** % operator can work on floats and doubles. Then it returns decimal remainder.

 */

public class RS_06_Operators_Types_Expressions {
    public static void main(String[] args) {
        int a = 4;
        int b = 6 + a;
//        int b = 6 % 3;
        System.out.println(b);
        System.out.println(56<9);
        System.out.println(2&3);

        System.out.println(4.8%1.1);
    }
}
