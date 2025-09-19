import java.util.Scanner;
public class TwoWayDecision{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Please Enter number : ");
        int num=sc.nextInt();
        if(num>0){
            System.out.println("จำนวนเต็มบวก");
        }else{
           System.out.println("ไม่เป็นจำนวนเต็มบวก");
        }
        System.out.println("จบโปรแกรม");
    }
}