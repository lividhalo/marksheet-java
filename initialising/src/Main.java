//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int priceA, priceB,priceC,priceD,priceE;
        double total,average;
        String name;
        System.out.println("Enter customer name:");
        name= scanner.nextLine();
        System.out.println("Enter the first price:");
        priceA = scanner.nextInt();
        System.out.println("Enter the second price:");
        priceB= scanner.nextInt();
        System.out.println("Enter the third price:");
        priceC= scanner.nextInt();
        System.out.println("Enter the fourth price:");
        priceD = scanner.nextInt();
        System.out.println("Enter the fifth price:");
        priceE = scanner.nextInt();

        total = priceA + priceB + priceC + priceD + priceE;
        average = total/5;
        System.out.println("Customer Name: "+name);
        System.out.println("the total price is " + total);
        System.out.println("the average price is " + average);
    }
}