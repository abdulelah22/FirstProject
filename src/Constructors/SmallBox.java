package Constructors;

public class SmallBox {
    public int length;
    public int width;

    // constructor is a method that has the same name as the class.
    // its executed when an object is created.
    // its used to set default value.
    // does not return anything.

    SmallBox(){
        this.length = 5;
        this.width = 6;

        System.out.println("Constructor is fired");
    }

    SmallBox(int length, int width){
        this.length = length;
        this.width = width;
    }

    void calculateArea(){
        System.out.println("The area is = " +(length * width));
    }
}
