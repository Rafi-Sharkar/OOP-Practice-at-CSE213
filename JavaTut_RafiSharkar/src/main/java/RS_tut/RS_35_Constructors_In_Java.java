package RS_tut;

// Constructor of MyEmployee1 class. this constructor methode's name same as it's class name.
// Constructor is optional, and it's overloadable


public class RS_35_Constructors_In_Java {

    static class MyEmployee1{
        private int id;
        private String name;

//        public MyEmployee1(){    // constructor of MyEmployee1 class. this constructor methode's name same as it's class name.
//            id = 334477;
//            name = "Dandi khor";
//        }

        public MyEmployee1(String myname){
            id = 23;
            name = myname;
        }

        public String getName(){    // getter
            return name;
        }
        public void setName(String n){      // setter
            name = n;
        }
        public int getId(){
            return id;
        }
        public void setId(int i){
            id = i;
        }
    }

    public static void main(String[] args) {
        MyEmployee rafi = new MyEmployee();
        rafi.setId(2111450);
        rafi.setName("Hasan Al Banna");
        System.out.println(rafi.getId());
        System.out.println(rafi.getName());

//        For avoiding the getter, setter and initialization class's variables/entributes we use constracture.

        MyEmployee1 alif = new MyEmployee1("don lee");
        alif.name = "Don Lee";
        System.out.println(alif.getName());
    }
}
