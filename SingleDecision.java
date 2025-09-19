import java.util.Scanner;
public class SingleDecision{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Please Enter number : ");
        int num=sc.nextInt();
        if(num>0){
            System.out.println("จำนวนเต็มบวก");
        }
        System.out.println("จบโปรแกรม");
    }
}