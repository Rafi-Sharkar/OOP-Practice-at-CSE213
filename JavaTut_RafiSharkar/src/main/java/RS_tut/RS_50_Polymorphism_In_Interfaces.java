package RS_tut;

interface Camera1{
    void takeSnap();
    void recordVideo();
    private void greet(){
        System.out.println("Good Morning");
    }
    default void record4KVideo(){
        greet();
        System.out.println("Recording in 4K...");
    }
}
interface Wifi1{
    String[] getNetworks();
    void connectToNetwork(String network);
}
class CellPhone1{
    void callNumber(int phoneNumber){
        System.out.println("Calling"+ phoneNumber );
    }
    void pickCall(){
        System.out.println("Connecting...");
    }
}
class SmartPhone1 extends CellPhone1 implements Camera1, Wifi1{
    public void takeSnap(){
        System.out.println("Taking Snap");
    }
    public void recordVideo(){
        System.out.println("Recording Video");
    }
    public String[] getNetworks(){
        System.out.println("Getting List of Networks");
        String[] networkList = {"Rafi", "Hasan","Tanjirul", "Mahabub", "Alif"};
        return  networkList;
    }
    public  void connectToNetwork(String network){
        System.out.println("Connecting to "+ network);
    }
    public void sampleMeth(){
        System.out.println("meth");
    }
}
public class RS_50_Polymorphism_In_Interfaces {
    public static void main(String[] args) {
        Camera1 cam1 = new SmartPhone1();   // this is a smartphone but use it as a camera
//        cam1.getNetwork();    // Not allowed. couse you reff Camera1
        cam1.record4KVideo();
        SmartPhone1 sp1 = new SmartPhone1();        // we can use all methods of SmartPhone1 class
        sp1.sampleMeth();
    }
}
