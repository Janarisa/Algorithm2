import java.util.Scanner;
public class Score{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter your midterm score : ");
        int mid=sc.nextInt();
        System.out.print("Enter your final score : ");
        int fi=sc.nextInt();
        int score = mid+fi;
        if(score>=50){
            System.out.println("Your total score is "+score+". The result is Pass!!");
        }else {
            System.out.println("Your total score is "+score+". The result is Fail!!");
        }
    }
}