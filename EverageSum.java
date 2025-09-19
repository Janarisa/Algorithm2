import java.util.Scanner;
public class EverageSum{
    public static void main(String args[]){
       Scanner scanner = new Scanner(System.in);

       System.out.print("Enter Num1 : ");
       int num1 = scanner.nextInt();

       System.out.print("Enter Num2 : ");
       int num2 = scanner.nextInt();
       
       System.out.print("Enter Num3 : ");
       int num3 = scanner.nextInt();

       System.out.print("Enter Num4 : ");
       int num4 = scanner.nextInt();
       
       System.out.print("Enter Num5 : ");
       int num5 = scanner.nextInt();

       int sum = num1+num2+num3+num4+num5;
       int ever =  sum/5;
       System.out.println("Total is "+sum+" Everage is "+ever);
    }
}