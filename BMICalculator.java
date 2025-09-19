import java.util.Scanner;
public class BMICalculator{
    public static void main (String args[]){
            Scanner scanner = new Scanner(System.in);
            System.out.print("enter your weight in kilograms: ");
            double weight = scanner.nextDouble();
            System.out.print("enter your height in meters: ");
            double height = scanner.nextDouble();
            double BMI = weight / (height*height);

            System.out.println("Your BMI for weight = "+weight+"kg and height = "+height+"meters is: "+BMI+"bmi.");
    }
}