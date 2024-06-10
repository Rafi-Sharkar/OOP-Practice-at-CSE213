package RS_tut;

/*
While loop__
    1. check the conditoin of loop
    2. if true then inter the loop   or   if false then don't inter the loop.
    3. Execute the statement between the loops. and then again step 1

    simplie__
    1. check condition
    2. Execute the statement
    3. Update the condition's variable.

 */

public class RS_17_WhileLoop {
    public static void main(String[] args) {
//        System.out.println(1);
//        System.out.println(2);
//        System.out.println(3);
//        for avoid this repeatation we are use looop

        System.out.println("Using Loop: While loop");
        int i = 1;
        while (i <= 3){     // terminated condition
            System.out.println(i);
            i++;    // increase the variable to avoid infinity loop(can be stack your system).
        }

    }
}
