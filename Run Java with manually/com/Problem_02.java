package folder.folderl1.folderl2;

class Calculator{
    public void calculator(int a , int b){
        System.out.println("Your result is "+ a+b);
    }
}
class ScCalculator{
    public void calculator(int a , int b){
        System.out.println("Your result is "+ (a+b)*2);
    }
}
class HybridCalculator{
    public void calculator(int a , int b){
        System.out.println("Your result is "+ a+b);
        System.out.println("Your result is "+ (a+b)*2);
    }
}

public class Problem_02 {
    protected int proInt = 4;
    int defInt = 13;
    public static void main(String[] args) {
        System.out.println("I am main method!!");
    }
}