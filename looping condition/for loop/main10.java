package loop;
import java.util.*;
public class main10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        double sum=0;
        double sum1=0;
        double tax=0;
        double service=0;
        double grand=0;
        for(int i=1;i<=n;i++){
            String itemName = sc.next();
            double price = sc.nextDouble();
            double quantity = sc.nextDouble();
            double sub_total = price*quantity;
            sum=sum+quantity;
            sum1=sum1+sub_total;
            tax=sub_total*0.08;
            service=sub_total*0.10;
            grand=sub_total+tax+service;
            System.out.println("Item : " + itemName);
            System.out.println("Price : $ " + price +" X " + (int)quantity);
            System.out.println("Subtotal : $ "+sub_total);

        }
        System.out.println("Total Items : " +(int)sum);
        System.out.println("Sub Total : $ " +sum1);
        System.out.println("Tax (8%): $" +tax);
        System.out.println("Service Charge (10%): $" +service);
        System.out.println("Grand Total : $" +grand);

    }
    
}
