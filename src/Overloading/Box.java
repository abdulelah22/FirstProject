package Overloading;

// overloading-polymorphism: when there is methods of the same name are different by there passing arguments.


public class Box {
    void calculateArea (int length){
        System.out.println("Area = " +(length * length));
    }
    void calculateArea (double length){
        System.out.println("Area = " + (length*length));

    }
    void calculateArea (int length , int width){
        System.out.println("Area = " +(length * width));
    }
}
