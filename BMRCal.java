import java.util.Scanner;
public class BMRCal{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your sex: ");
        char sex=sc.next().charAt(0);

        if(sex=='m'){
            System.out.print("Enter your weight (kilograms): ");
            int weight=sc.nextInt();
            System.out.print("Enter your high (centimeters): ");
            int high=sc.nextInt();
            System.out.print("Enter your old (years): ");
            int old=sc.nextInt();
            double BMR=66+(13.7*weight)+(5*high)-(6.8*old);
            System.out.println("Your BMR is : "+BMR);
        }else{
            System.out.print("Enter your weight (kilograms): ");
            int weight=sc.nextInt();
            System.out.print("Enter your high (centimeters): ");
            int high=sc.nextInt();
            System.out.print("Enter your old (years): ");
            int old=sc.nextInt();
            double BMR=655+(9.6*weight)+(1.8*high)-(4.7*old);
            System.out.println("Your BMR is : "+BMR);
        }
    }
}