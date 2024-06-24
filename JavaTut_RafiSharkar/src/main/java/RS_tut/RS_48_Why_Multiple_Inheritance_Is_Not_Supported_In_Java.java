package RS_tut;

/*
    ==> "Why_Multiple_Inheritance_Is_Not_Supported_In_Java."
    --> means multiple parents for one child.

 # Is multiple inheritance allowed in Java ?
   --> Multiple inheritance face problems when there exist methods with some signature in both the super classes.
        Due to such problems, Java does not support multiple inheritance directly but the similar Concept can be achieved using Interfaces.
        A class can implement multiple Interfaces and extend a class at some time.

  Note:
    1.  Interfaces in Java is a bit like the class but with a significant difference.
    2.  An Interface can only have method signatures, fiends and default methods.
    3. The class implementing an Interface needs to on declare the methods (not fields)
    4.  You can create a reference of Interfaces but not the object
    5.  Interface methods are public by default.

        C --> Class
        I --> Interface
        C_CellPhone, I_GPS, I_Camera, I_MediaPlayer == SmartPhone

    Default methods__
    --> An interface can have static and default methods.
        Default methods enable us to add new functionality to exsting Interfaces.
        This feature was interoduced in Java 8 to ensure backword compatibity while updating an interface.
        Classes implementing the interface need not implement the default methods.
        Interfaces can also include private methods for default methods to use. ***

 */

interface Camera{
    void takeSnap();
    void recordVideo();
    private void greet(){       // private method willn't be use in child class. It only use in this class to help default method to make simpler
        System.out.println("Good morning");
    }
    default void record4KVideo(){           // it's not required for child class. but we can overwrite this method.
        greet();
        System.out.println("Recording in 4K");
    }
}
interface Wifi{
    String[] getNetworks();
    void connectToNetwork(String network);
}
class MyCellPhone{
    void callNumber(int phoneNumber){
        System.out.println("Calling " + phoneNumber);
    }
    void pickCall(){
        System.out.println("Connecting... ");
    }
}

class SmartPhone extends MyCellPhone implements Camera, Wifi{       // Child class
//    public void record4KVideo(){
//        System.out.println("Recording in 4K at child class");
//    }
    @Override
    public void takeSnap(){
        System.out.println("Taking Snap ");
    }
    @Override
    public void recordVideo(){
        System.out.println("Recording video");
    }
    @Override
    public String[] getNetworks(){
        System.out.println("Getting List of Networks");
        String[] networkList = {"Rafi", "Hasan", "Alif", "Zidan", "Mahabub", "Tanjirul", "Mohidul"};
        return networkList;
    }
    @Override
    public void connectToNetwork(String network) {
        System.out.println("Connecting to " + network);
    }
}

public class RS_48_Why_Multiple_Inheritance_Is_Not_Supported_In_Java {
    public static void main(String[] args) {
        SmartPhone sm = new SmartPhone();
        sm.record4KVideo();
//        sm.greet();     // we can't use private method after make object. It only use at that class.
        String[] ar = sm.getNetworks();
        for (String item: ar){
            System.out.println(item);
        }
    }
}
