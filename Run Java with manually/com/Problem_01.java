package calc;

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

public class Problem_01 {
    public static void main(String[] args) {
        System.out.println("I am main method!!");
    }
}