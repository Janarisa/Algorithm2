import java.util.Scanner;
public class FahrenheitToCelsius{
    public static void main (String args[]){
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter Fahrenheit :");
            float fahrenheit = scanner.nextFloat();
            float celsius = (fahrenheit-32)*5/9;
            System.out.println("Fahrenheit is "+fahrenheit+" to Celsius = "+celsius);
    }
}