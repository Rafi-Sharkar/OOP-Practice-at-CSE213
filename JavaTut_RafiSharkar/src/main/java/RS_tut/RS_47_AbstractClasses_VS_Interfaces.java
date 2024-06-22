package RS_tut;

interface Bicycle{
    int a = 45;     // all properties of interface are final.
    void applyBreak(int decrement);
    void speedUp(int increment);
}
interface HornBicycle{
    int b = 5;     // all properties of interface are final.
    void slowHorn(int decrement);
    void loudHorn(int increment);
}

class RafiCycle implements Bicycle, HornBicycle{
    public void applyBreak(int decrement){
        System.out.println("Applying Break");
    }
    public void speedUp(int increment){
        System.out.println("speed Up");
    }

    @Override
    public void slowHorn(int decrement) {
        System.out.println("gogo");
    }

    @Override
    public void loudHorn(int increment) {
        System.out.println("ha ha");
    }
}

public class RS_47_AbstractClasses_VS_Interfaces {
    public static void main(String[] args) {
        RafiCycle rc = new RafiCycle();
        rc.applyBreak(3);
        // We can create properties in Interfaces
        System.out.println(rc.a);
        // We can't modify the properties in Interfaces as they are final
//        rc.a = 3;     // we can't do this.

        rc.slowHorn(3);
        rc.loudHorn(9);
    }
}
