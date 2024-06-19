package RS_tut;

// this is for call own same name on same class. it's usefull for object

class AClass{
    int a;
    public  int getA(){
        return a;
    }
    AClass(int a){
        this.a = a;
    }
    public int returnone(){
        return 1;
    }
}

public class RS_40_ThisAndSuper {
    public static void main(String[] args) {
        AClass ac = new AClass(34);
        System.out.println(ac.getA());
    }
}
