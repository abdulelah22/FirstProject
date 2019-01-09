package Abstract;

public class CircleContainer extends Container {
    public double calculateAreaOfBase(int length){

        double area = Math.PI*(length/2)*(length/2);
        System.out.println("The Circle Area is: "+ area);

        return area;
    }
}
