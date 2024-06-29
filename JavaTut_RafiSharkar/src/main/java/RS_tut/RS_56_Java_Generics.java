package RS_tut;

/*
    Hence generics aim to reduce bugs 8 enhance type safety.
    Note:
 */

import java.util.ArrayList;

class MyGeneric<T1, T2>{
    int val = 355;
    private T1 t1;
    private T2 t2;

    public MyGeneric(int val, T1 t1, T2 t2) {
        this.val = val;
        this.t1 = t1;
        this.t2 = t2;
    }
//    getter and setter

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public T1 getT1() {
        return t1;
    }

    public void setT1(T1 t1) {
        this.t1 = t1;
    }

    public T2 getT2() {
        return t2;
    }

    public void setT2(T2 t2) {
        this.t2 = t2;
    }
//    toString()

    @Override
    public String toString() {
        return "MyGeneric{" +
                "val=" + val +
                ", t1=" + t1 +
                ", t2=" + t2 +
                '}';
    }
}

public class RS_56_Java_Generics {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
//        ArrayList<int> arrayList = new ArrayList();       --- this will produce an error
        arrayList.add(2);
        arrayList.add(45);
        arrayList.add(56);

         int a =arrayList.get(2);
//        System.out.println(a);

        MyGeneric<String, Double> g1 = new MyGeneric(23, "Hellow bhi", 3.1416);
        String str = g1.getT1();
        double db = g1.getT2();
        int val = g1.getVal();
        System.out.println(g1.toString());


    }
}
