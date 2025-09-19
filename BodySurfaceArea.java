import java.util.Scanner;
public class BodySurfaceArea{
    public static void main (String args[]){
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter wildth of body : ");
            int wildth = scanner.nextInt();
            System.out.print("Enter length of body : ");
            int length = scanner.nextInt();
            int body = (wildth  *length)/360;
            System.out.println("Body Surface Area = "+body);
    }
}