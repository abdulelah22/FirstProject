package Superex;

public class SubBox extends Box {
    public double calculateVolume(int length, int width, int height){
        double volume = super.calculateArea(length,width)*height;
        System.out.println("The volume equals to: " + volume);
        return volume;

    }
}
