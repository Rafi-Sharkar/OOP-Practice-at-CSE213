package RS_tut;

/*
    Interface in English__
    =>  A point where two systems meet and interact.
    Interface in Java__
    =>  Interface is a group of related methods with empty bodies.
        -> interface has no object,
        -> interface's can a reference

        Ex:     interface Bicycle{
                        void applyBreak(int decrement);
                        void speedUp(int increment);
                        }
                  class CycleOfRafi implements Bicycle{
                        int speed = 7;
                        void applyBreak(int decrement){
                            speed = speed - decrement;
                        }
                        void speedUp(int increment){
                            speed = speed + increment;
                        }
                  }

        Abstract class VS Interfaces
        => We can't create a class with multiple abstract classes. But we can implement multiple interfaces at a time.
 */

public class RS_46_Introduction_To_Interfaces {
    public static void main(String[] args) {

    }
}
