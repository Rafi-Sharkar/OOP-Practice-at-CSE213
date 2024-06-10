package RS_tut;

class Employee1 {
    int salary;
    String name;
    public int getSalary(){
        return salary;
    }
    public String getName() {
        return name;
    }
    public void setName(String n){
        name = n;
    }
}



public class RS_32_BasicQuestionOnOOP {
    public static void main(String[] args) {
        Employee1 rafi = new Employee1();
        rafi.setName("Rafi Sharkar");
        System.out.println(rafi.getName());
    }
}
