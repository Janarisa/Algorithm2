import java.util.Scanner;
public class NoteChange_2{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter price of product: ");
        int price = sc.nextInt();
        System.out.print("Enter quality of product: ");
        int qua = sc.nextInt();
        int amount=price*qua;
        System.out.println("Amount: "+amount+" baht");
        if(amount<=1000){
        int change=1000-amount;
        System.out.println("Change is: "+change+" baht");

        int fiveHundred=change/500;
        System.out.println("Five-hundred note: "+fiveHundred+" note(s)");
        int change1=change%500;

        int hundred=change1/100;
        System.out.println("Hundred note: "+hundred+" note(s)");
        int change2=change1%100;

        int fifty=change2/50;
        System.out.println("Fifty note: "+fifty+" note(s)");
        int change3=change2%50;
        
        int twenty=change3/20;
        System.out.println("Twenty note: "+twenty+" note(s)");
        int change4=change3%20;

        int ten=change4/10;
        System.out.println("Ten coin: "+ten+" coin(s)");
        int change5=change4%10;

        int five=change5/5;
        System.out.println("Five coin: "+five+" coin(s)");
        int change6=change5%5;

        int two=change6/2;
        System.out.println("Two coin: "+two+" coin(s)");
        int change7=change6%2;

        System.out.println("One coin: "+change7+" coin(s)");
        }else{
            System.out.println("Not enough money");
        }
    }
}