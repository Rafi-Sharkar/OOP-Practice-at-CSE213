package RS_tut;

public class RS_27_VarArgs_VariableArguments {

    static int sum1(int a, int b){
        return Math.addExact(a,b);
    }

    static int sumAll(int ...arr){
//        Available as int [] arr;
        int result=0;
        for (int e:arr){
            result+=e;
        }
        return result;
    }

    static int sumAllWithCompolsaryPara(int x,int ...arr){
//        Available as int [] arr;
        int result=x;
        for (int e:arr){
            result+=e;
        }
        return result;
    }



    public static void main(String[] args) {
        System.out.println("Throw VarArgs we can give zero or more arguments in method");

        int a = 3, b = 5;
        System.out.println(sumAll(3,4,5,6,7,2,5,2,514,5,1));
        System.out.println("Sum nothing: "+sumAll());
        System.out.println("SumAll with combolsary one parameter: "+sumAllWithCompolsaryPara(5));




    }
}
