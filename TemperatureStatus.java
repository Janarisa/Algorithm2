import java.util.Scanner;
public class TemperatureStatus{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter temperature in Celsius: ");
        double tem=sc.nextDouble();
        System.out.printf("Temperature: %.2f C\n",tem);
        if(tem>35){
            System.out.println("Status : Hot");
        }else if(tem>=20){
            System.out.println("Status : Normal");
        }else{
             System.out.println("Status : Cold");
        }
    }
}