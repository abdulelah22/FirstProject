package Staticex;

public class ExampleStatic {
    static int staticVariable;

    int nonStaticVariable;
// static is one per class / not one per object. the variable will continue regardless of the object created.
    static public void staticMethod(){
        System.out.println("Static variable: " + staticVariable);
        staticVariable++;
    }
    public void nonStaticMethod(){
        System.out.println("Non Static variable: " + nonStaticVariable);
        nonStaticVariable++;
    }
    static {
        System.out.println("Static Block Of Code");
    }

    public ExampleStatic(){

        System.out.println("Constructor");

    }
}
