package RS_tut;

public class RS_24_Array_PracticeSet {
    public static void main(String[] args) {
        /*
//        Practice Problem 1
        float [] marks = {45.7f, 67.8f, 63.4f, 99.2f, 100.0f};
        float sum = 0;
        for (float element: marks){
            sum = sum + element;
        }
        System.out.println("The value of sum of all marks: "+ sum);

//          Practice Problem 2
        float num = 63.4f;
        boolean isInArray = false;

        for (float element: marks){
            if (num == element){
                isInArray = !isInArray;
                break;
            }
        }
        if (isInArray){
            System.out.println("Found the item");
        }else {
            System.out.println("I don't get it");
        }



//        Practice Problem 3
        float [] mark2 = {45.7f, 67.8f, 63.4f, 99.2f, 100.0f};
        float sum = 0;
        for (float element: mark2){
            sum = sum + element;
        }
        System.out.println("The value of average marks is "+ sum/mark2.length);

//        Practice Problem 4
        int [][] mat1 = {{1,2,3,4},
                        {5,6,7,8}};
        int [][] mat2 = {{2,3,4,5},
                        {6,7,8,9}};
        int [][] result = {{0,0,0,0},
                           {0,0,0,0}};
        System.out.println(result);

        for(int i=0;i<mat1.length; i++){    // row num of time
            for(int j=0;j<mat1[i].length; j++){     // column cumber of time
                System.out.print(result[i][j]);
                result[i][j] = mat1[i][j] + mat2[i][j];    // how to print 2d array. and solve problem([[I@6acbcfc0).
            }
            System.out.println();
        }

//        Practice Problem 5: Reverse the array.
//        [1,2,3,4]  --> [4,3,2,1]

        int [] num = {1,2,3,4,5};
        int l = num.length;
        int n = Math.floorDiv(num.length, 2);

        for (int i=0;i<n; i++){
            int temp = num[i];
            num[i]=num[l-1-i];
            num[l-1-i] = temp;
        }

        for(int element: num){
            System.out.print(element);
        }

//        Practice Problem 6
        int [] num = {1,2,3,4,5};
        int max = num[0];
        for (int e:num){
            if (e>max){
                max = e;
            }
        }
        System.out.println("The max value of array is : "+ max);

//        Practice Problem 7
        int [] num1 = {1,2,3,4,5};
        int min = num1[0];
        for (int e:num1){
            if (e<min){
                min = e;
            }
        }
        System.out.println("The min value of array is : "+ min);
*/
//        Practice Problem 8: is sorted in asynding order
        int [] num2 = {6,1,2,3,4,5};
        boolean isSortedD = true;
        for (int i=0; i<num2.length-1; i++){
            if (num2[i]>num2[i+1]){
                isSortedD = false;
                break;
            }
        }
        if (isSortedD){
            System.out.println("The array is sorted");
        }else {
            System.out.println("The array isn't sorted");
        }



    }
}
