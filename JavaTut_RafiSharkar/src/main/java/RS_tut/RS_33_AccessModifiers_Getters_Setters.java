package RS_tut;

/*
Access Modifiers
-> Specifier where a property/method is accessible.There are four types of access modifiers in Java.

1. Private
2. Default
3. Protected
4. Public



 */

class MyEmployee{
    private int id;
    private String name;

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

public class RS_33_AccessModifiers_Getters_Setters {
    public static void main(String[] args) {

        MyEmployee rafi = new MyEmployee();
//        rafi.id = 2131130;
//        rafi.name = "Rafi Sharkar";       // Throws an error due to private access modifier.
        rafi.setId(2111450);
        rafi.setName("Hasan Al Banna");
        System.out.println(rafi.getId());
        System.out.println(rafi.getName());

    }
}
