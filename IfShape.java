import java.util.Scanner;
public class IfShape{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num=sc.nextInt();

        if(num==1){
            System.out.print("Enter base of triangle : ");
            int base = sc.nextInt();
            System.out.print("Enter height of triangle : ");
            int height = sc.nextInt();
            int areatri = (base*height)*1/2;

            System.out.println("Area of triangle is "+areatri+" square units");
        }else if (num==2){
            System.out.print("Enter your weight in kilograms: ");
            double weight = sc.nextDouble();
            System.out.print("Enter your height in meters: ");
            double height = sc.nextDouble();
            double BMI = weight / (height*height);

            System.out.println("Your BMI for weight = "+weight+"kg and height = "+height+"meters is: "+BMI+" bmi.");
        }
    }
}