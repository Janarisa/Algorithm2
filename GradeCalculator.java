import java.util.Scanner;
public class GradeCalculator{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter name : ");
        String name=sc.nextLine();
        System.out.print("Enter score (0-100): ");
        int score=sc.nextInt();
        char grade;
        if(score<0 || score>100){
            System.exit(0);
        }else{
            if(score>=80){
                grade='A';
            }else if(score>=70){
                grade='B';
            }else if(score>=60){
                grade='C';
            }else if(score>=50){
                grade='D';
            }else{
                grade='E';
            }
            System.out.println("---Result---");
            System.out.println("Name : "+name);
            System.out.println("Score : "+score);
            System.out.println("Grade : "+grade);
        }
    }
}