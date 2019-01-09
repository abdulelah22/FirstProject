package Abstract;

public abstract class Container {

    public void calculateVolume(int length , int height){
        double volume = calculateAreaOfBase(length)*height;
        System.out.println("The Volume Equals To: " + volume);

    }
    public abstract double calculateAreaOfBase(int length);


}
