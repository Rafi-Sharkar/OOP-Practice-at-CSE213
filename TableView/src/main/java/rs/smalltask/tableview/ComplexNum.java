package rs.smalltask.tableview;

class ComplexNum {
    private int real;
    private int img;

    static int complexNoCount = 0;

    public ComplexNum(){
        real = img = 0;
        complexNoCount++;
        System.out.println("FYI, This is the "+ complexNoCount +"-th complexNo");
    }
    public int getReal() {
        return real;
    }
    public void setReal(int real) {
        this.real = real;
    }
    public int getImg() {
        return img;
    }
    public void setImg(int img) {
        this.img = img;
    }
public static int getComplexNoCount(){
        return complexNoCount;
}
public static void setComplexNoCount(int complexNoCount){
        ComplexNum.complexNoCount = complexNoCount;
}
public ComplexNum(int real, int img){
        this.real = real;
        this.img = img;
        complexNoCount++;
    System.out.println("FYI, This is the "+ complexNoCount + "-th complexNo");
}
// will add methods in future classes
    public ComplexNum add(ComplexNum c){
        ComplexNum temp = new ComplexNum();
        temp.real = this.real + c.real;
        temp.img = this.img + c.img;
        return temp;
    }
    public ComplexNum add(ComplexNum para1, ComplexNum para2){
        ComplexNum temp = new ComplexNum();
        temp.real = this.real + para1.real + para2.real;
        temp.img = this.img + para1.img + para2.img;
        return temp;
    }
    public ComplexNum add(int val){
        ComplexNum temp = new ComplexNum();
        temp.real = this.real + val;
        temp.img = this.img = val;
        return temp;
    }
    /*
    @Override
    public  String toString(){
        return "ComplexNo{" +
                "real=" + real +
                ", img=" + img +
                '}';
    }
    */

    @Override
    public String toString(){
        String sign = "";
        if(img>=0) sign = "+";
        return "Complex No: " + real + sign + img + "i";
    }
}
