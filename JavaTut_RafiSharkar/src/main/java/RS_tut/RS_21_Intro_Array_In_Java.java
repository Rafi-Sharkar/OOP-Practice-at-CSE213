package RS_tut;

/*
Array is a contiguous collection of similar type of data;
  # classroom of 500 students - You have to store marks of these 500 students
   -> you have 2 options:
    1. create 500 variables,
    2. use arrays (recommended)
 */

public class RS_21_Intro_Array_In_Java {
    public static void main(String[] args) {
//        There are three ways to write array.
//      1___
        int [] stu;     // Declaration!
        stu = new int[500];     // Mamory allocation!

//      2___
        int [] tech = new int[7];   // Declaration + Memory allocation!

//      3___
        int [] sub = {100, 72, 86, 83, 98,78};     // Declaration + Initialige!

        System.out.println(sub.length);

        int [] marks = new int[5];
//      Initialization___
        marks[0] = 100;
        marks[1] = 200;
        marks[2] = 300;
        marks[3] = 400;
        marks[4] = 500;
//        marks[5] = 600;   // it throws an error {Index 5 out of bounds for length 5}
//        System.out.println(marks[5]);

    }
}
