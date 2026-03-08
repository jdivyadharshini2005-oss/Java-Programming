package loop;
import java.util.*;
public class main11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        double original=0;
        double final_price=0;
        double discount=0;
        for(int i=1;i<=n;i++){
            String seatType = sc.next();
            String customerType = sc.next();
            double price=0;
            if(seatType.equalsIgnoreCase("Regular")){
                price=12;
            }
            else if(seatType.equalsIgnoreCase("Premium")){
                price=18;
            }
            else if(seatType.equalsIgnoreCase("Recliner")){
                price=25;
            }
            double customer = 0;
            if(customerType.equalsIgnoreCase("Adult")){
                customer=0;
            }
            else if(customerType.equalsIgnoreCase("Child")){
                customer=30;
            }
            else if(customerType.equalsIgnoreCase("Senior")){
                customer=25;
            }
            double ticket=price*(1-customer/100);
            original=original+price;
            final_price=final_price+ticket;

            System.out.println("Ticket " + i +" : " + seatType + " - " + customerType);
            System.out.println("Base Price : $ " + price);
            System.out.println("Discount : " +(int)customer + " % ");
            System.out.println("Final Price : " + ticket);
        }
        if(n>=5){
            final_price=final_price*10;
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
        double total=original-final_price;
        System.out.println("Total Tickets : " +n);
        System.out.println("Original Total : $" +original);
        System.out.println("Total Discount : $" +total);
        System.out.println("Final Total : $" +final_price);
        System.out.println("Group Discount Applied : " +(n>=5 ? "Yes" :"No"));
    }
}
