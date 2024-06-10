package RS_tut;

class Employee{
    int id;
    String name;
    int salary;

    public void printDetails(){
        System.out.println("My id is "+ id);
        System.out.println("My name is "+ name);
        System.out.println("My salary is "+ salary);
    }
}

public class RS_31_CreatingOurOwnJavaClass {
    public static void main(String[] args) {
        System.out.println("This is our custom class");

        Employee banna = new Employee();    // Instantiating a new Employee Object
//        Setting properties
        banna.id = 21;
        banna.name = "Hasan";
        banna.salary = 30000;


//        displaying properties
//        System.out.println(banna.id);
//        System.out.println(banna.name);
        banna.printDetails();
    }
}
