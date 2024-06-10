package RS_tut;

public class RS_22_ForEachLoop {
    public static void main(String[] args) {
        int [] marks1 = {2,6,8,2,2,3,6};
        float [] marks2 = {2.3f,6.6f,8.0f,2.3f,2.2f,3.99f};
        String [] stuName = {"Rafi", "Hasan", "Mahabub", "Ayesha","Pushpa"};

        System.out.println(marks1.length);
        System.out.println(marks2.length);
        System.out.println(stuName.length);

//        Displaying the array (Naive way)
        System.out.println("Displaying the array (Naive way)");
        System.out.println(stuName[0]);
        System.out.println(stuName[1]);
        System.out.println(stuName[2]);
        System.out.println(stuName[3]);
        System.out.println(stuName[4]);

//        Displaying the array (Using loop)
        System.out.println("Displaying the array (Using loop)");
        for(int i=0; i< stuName.length; i++){
            System.out.println(stuName[i]);
        }
        System.out.println("Loop with reverse order");
        for(int i= stuName.length-1; i>=0; i--){
            System.out.println(stuName[i]);
        }

//        Displaying the array (For Each loop)
        System.out.println("Displaying the array (For Each loop)");
        for(String element: stuName){
            System.out.println(element);
        }
    }
}
