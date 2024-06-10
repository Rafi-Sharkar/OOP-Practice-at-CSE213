package RS_tut;

//  Problem
class Cylinder{
    private int radius;
    private int height;

    public Cylinder(int radius, int height) {
        this.radius = radius;
        this.height = height;
    }

    //    Problem 1
    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

//    Problem 2
    public float surfaceArea(){
        return (float)((2*3.1416*radius*radius)+(2*3.1416*radius*height));
    }
    public float volume(){
        return (float)(3.142* radius * radius * height);
    }
}


public class RS_37_PracticeSet_AccessModifierAndConstructor {
    public static void main(String[] args) {
// Problem 1
    /*
        Cylinder myCylinder = new Cylinder();
        myCylinder.setRadius(12);
        myCylinder.setRadius(12);
        myCylinder.setHeight(15);
        System.out.println(myCylinder.getRadius());
        System.out.println(myCylinder.getHeight());
     */

//  Problem 2
        /*
        Cylinder myCylinder = new Cylinder();
        myCylinder.setRadius(9);
        myCylinder.setHeight(12);
        System.out.println("Area of the Cylinder is "+myCylinder.surfaceArea());
        System.out.println("Volume of the Cylinder is "+myCylinder.volume());
        */

//   Problem 3
        /*
        Cylinder myCylinder = new Cylinder(9,12);
        System.out.println("Volume of the Cylinder is "+myCylinder.volume());
        System.out.println("Area of the Cylinder is "+myCylinder.surfaceArea());
        */

    }
}
