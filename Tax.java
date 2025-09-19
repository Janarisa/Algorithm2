import java.util.Scanner;
public class Tax{
    public static void main (String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your salary : ");
        int salary = scanner.nextInt();
        int tax = salary*10/100;
        System.out.println("Your salary is "+salary+" baht Tax total "+tax+" baht");
    }
}