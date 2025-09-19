import java.util.Scanner;
public class Radius{
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
         System.out.print("Enter Radius : ");
         double radius=scanner.nextDouble();
         double area = 3.14*radius*radius;
         System.out.println("Area of circle that has radius = "+radius+" meters is "+area+" square maters");
    }
}