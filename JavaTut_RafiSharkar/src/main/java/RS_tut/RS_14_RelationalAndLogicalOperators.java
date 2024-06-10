package RS_tut;

/*
Relational operators__
   --> ==, >, <, >=, <=
Logical operators__
   --> !, &&, ||
 */

public class RS_14_RelationalAndLogicalOperators {
    public static void main(String[] args) {
        boolean a = true;
        boolean b = false;
//  and op
        if (a && b){
            System.out.println("yes");
        }else{
            System.out.println("No");
        }
//  or op
        if (a || b){
            System.out.println("yes");
        }else{
            System.out.println("No");
        }
//  not op
        if (!a == b){
            System.out.println("yes");
        }else{
            System.out.println("No");
        }
    }
}
