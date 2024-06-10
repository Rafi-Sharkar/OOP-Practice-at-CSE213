package RS_tut;


/*
 * Data Type(2) --> Primitive data type, Non Primitive data type
 *  Primitive data type(8) --> byte, short, int, long, float, double, boolean
 *      type -- value ranges -- takes -- Default value
 *      byte -- -128 -- 127 -- 1byte -- 0
 *      short -- (-2^16)/2 to (2^16)/2 -1 -- 2byte -- 0
 *      int -- same -- 4byte
 *      float -- same -- 4bytes
 *      long -- 8bytes
 *      double -- 8bytes
 *      char -- 2bytes {it can take all language 2^16 unique symbles}
 *  Non Primitive data type --> String
 */

public class RS_01_VariablesAndDataTypes {
    public static void main(String[] args){
        System.out.print("The sum of these numvers is ");
        int num1 = 6;
        int num2 = 3;
        int num3 = 4;
        int num4 = 1;
        int sum = num1 + num2 + num3 + num4;
        System.out.println(sum);
    }
}

