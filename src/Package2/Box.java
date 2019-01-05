package Package2;

public class Box {
    public double length; //Class level Data.
    public double width;

    public double calculateArea(int length,int width)

    // Passing arguments.
    {
        double area = this.length * this.width;

        System.out.println("Area is " + area );
        return area;
    }
}
