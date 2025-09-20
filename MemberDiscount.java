import java.util.Scanner;
public class MemberDiscount{
    public static void main (String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter membership level (Silver,Gold,Platinum): ");
        String mem=sc.nextLine();
        System.out.print("Enter total purchase amount: ");
        float total=sc.nextFloat();

        if(mem.equals("Silver")){
            float dis=total*5/100;
            float finalP=total-dis;
            System.out.println("---Receipt---");
            System.out.printf("Member level : %s\n",mem);
            System.out.printf("Total purchase : %.2f\n",total);
            System.out.printf("Discount : %.2f\n",dis);
            System.out.printf("Final price : %.2f\n",finalP);
        }else if(mem.equals("Gold")){
            float dis=total*10/100;
            float finalP=total-dis;
            System.out.println("---Receipt---");
            System.out.printf("Member level : %s\n",mem);
            System.out.printf("Total purchase : %.2f\n",total);
            System.out.printf("Discount : %.2f\n",dis);
            System.out.printf("Final price : %.2f\n",finalP);
        }else if(mem.equals("Platinum")){
            float dis=total*15/100;
            float finalP=total-dis;
            System.out.println("---Receipt---");
            System.out.printf("Member level : %s\n",mem);
            System.out.printf("Total purchase : %.2f\n",total);
            System.out.printf("Discount : %.2f\n",dis);
            System.out.printf("Final price : %.2f\n",finalP);
        }else{
            System.out.println("---Receipt---");
            System.out.printf("Member level : %s\n",mem);
            System.out.printf("Total purchase : %.2f\n",total);
            System.out.println("Discount : 0.0");
            System.out.printf("Final price : %.2f\n",total);
        }
    }
}