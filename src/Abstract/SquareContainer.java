package Abstract;

public class SquareContainer extends Container {

public double calculateAreaOfBase (int length){

    double area = (length * length);
    System.out.println("The Square Area is: " + area);

    return area;

}
}
