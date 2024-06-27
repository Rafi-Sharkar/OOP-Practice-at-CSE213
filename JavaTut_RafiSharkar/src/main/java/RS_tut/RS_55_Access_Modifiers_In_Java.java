package RS_tut;

/*
 Access Modifiers in Java___
    ==> Access modifiers determine whether other classes can use a particular field or invoke a particular method. Can be public, private, protected or default(no modifier)

###__Access Levels__###
Modifier  --	Class  --	Package  --  Subclass(another package)   --	World
public  --	Y  -- Y	--  Y  --	 Y
protected	--	Y  -- Y	--  Y  --	 N
no modifier(default)   --	Y  -- Y	--  N  --  N
private	--	Y  -- N	--  N  --   N
 */

class C1{
    public int x = 2001;
    protected int y = 1998;
    int z = 2000;
    private int a = 2007;

    public void meth1(){
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(a);
    }
}

public class RS_55_Access_Modifiers_In_Java {
    public static void main(String[] args) {
        C1 c1 = new C1();
//        c1.meth1();     // we can use all modifier at same class
        System.out.println(c1.x);
        System.out.println(c1.y);
        System.out.println(c1.z);
//        System.out.println(c1.a);
    }
}
