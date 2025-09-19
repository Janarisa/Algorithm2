import java.util.Scanner;
public class AreaTriAndRec{
    public static void main(String args[]){
       Scanner scanner = new Scanner(System.in);

       System.out.print("Enter base of triangle : ");
       int base = scanner.nextInt();

       System.out.print("Enter height of triangle : ");
       int height = scanner.nextInt();

       int areatri = (base*height)*1/2;
       System.out.println("Area of triangle is "+areatri+" square units");

       System.out.print("Enter length of rectangle : ");
       int length = scanner.nextInt();

       System.out.print("Enter wildth of rectangle : ");
       int wildth = scanner.nextInt();
      
       int arearec = length*wildth;
       System.out.println("Area of rectangle is "+arearec+" square units");
    }
}