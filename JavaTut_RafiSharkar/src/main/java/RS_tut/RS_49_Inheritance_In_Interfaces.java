package RS_tut;

/*
    There we can inherit one interface to another interface.
    Interface can only implement at class. Interface can't extend in class.
    but Interface can extend in Interfaces.
 */

interface sampleInterface{
    void meth1();
    void meth2();
}
interface childSampleInterface extends sampleInterface{
    void meth3();
    void meth4();
}
class MySampleClass implements childSampleInterface{
     public void meth1(){
        System.out.println("Meth1");
    }
     public void meth2(){
        System.out.println("Meth2");
    }
    public void meth3(){
        System.out.println("Meth3");
    }
    public void meth4(){
        System.out.println("Meth4");
    }
}

public class RS_49_Inheritance_In_Interfaces {
    public static void main(String[] args) {
        MySampleClass obj = new MySampleClass();
        obj.meth1();
        obj.meth2();
        obj.meth3();
        obj.meth4();
    }
}
