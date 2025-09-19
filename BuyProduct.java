import java.util.Scanner;
public class BuyProduct{
    public static void main(String args[]){
        Scanner scanner=new Scanner(System.in);

        System.out.print("Product #1 name : ");
        String name1 = scanner.nextLine();
        System.out.print("Product #1 price: ");
        double price1 = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Product #2 name : ");
        String name2 = scanner.nextLine();
        System.out.print("Product #2 price : ");
        double price2 = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Product #3 name : ");
        String name3 = scanner.nextLine();
        System.out.print("Product #3 price : ");
        double price3 = scanner.nextDouble();
        scanner.nextLine();

        System.out.print("Customer paid money : ");

        double money = scanner.nextDouble();
        double PriceBeTax = price1+price2+price3;
        double Vat=PriceBeTax*0.07;
        double Net=PriceBeTax+Vat;
        double Change=money-Net;

        System.out.println("------------Recipt------------");
        System.out.printf("%s : %.2f baht\n",name1,price1);
        System.out.printf("%s : %.2f baht\n",name2,price2);
        System.out.printf("%s : %.2f baht\n",name3,price3);
        System.out.printf("Total Price Before Tax : %.2f baht\n",PriceBeTax);
        System.out.printf("VAT = %.2f baht\n",Vat);
        System.out.printf("Net Price %.2f baht\n",Net);
        System.out.printf("Total Paid %.2f baht\n",money);
        System.out.printf("Change = %.2f baht",Change);
    }
}