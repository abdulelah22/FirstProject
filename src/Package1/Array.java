package Package1;

public class Array {
    public static void main(String[] args){
       /* int a = 10;
        int b = 20;
        int c,d,e;
        c = 30; d = 40; e = 50;*/
       int[] a = {10,20,30,40,50};
       System.out.print(a[2]+" "+ a[4]);
       for(int temp:a){
           System.out.println(temp);
       }
       System.out.println("-------------");
       int[] x = new int[5];

       x [3] = 25;
       x [0] = 12;
       for(int temp2 : x){
           System.out.println(temp2);
       }
       System.out.println("--------------");
       String[] st = {"one","two","three"};
       for(String temp3 : st){
           System.out.println(temp3);
       }
       System.out.println("---------------");
       String [] stx = new String[5];
       stx[3] = "25";
       stx[0] = "12";
       for(String temp4 : stx){
           System.out.println(temp4);
       }
    }
}
