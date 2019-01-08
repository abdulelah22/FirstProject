package Inhertinace;

public class NewBox extends Box {
    public void calculateVolume(int length , int width , int hight){

        System.out.println("The Volume Equals To: " +(length*width*hight));
    }
    @Override
    public void calculateArea(int length, int width) {
        System.out.println("The Sub Area Equals: " + (length/width));
    }
}
