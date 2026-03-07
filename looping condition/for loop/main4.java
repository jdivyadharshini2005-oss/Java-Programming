package loop;
import java.util.*;
public class main4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double sum= 0;
        double sum1= 0;
        double maxSales = 0;
        String topPerformer = "";
        for(int i = 1; i <= n; i++) {
            String repName = sc.next();
            double salesAmount = sc.nextDouble();
            int commission = 0;
            if(salesAmount <= 40000) {
                commission = 5;
            }
            else if(salesAmount <= 80000) {
                commission = 8;
            }
            else if(salesAmount <= 100000) {
                commission = 10;
            }
            else if(salesAmount <= 150000) {
                commission = 12;
            }
            else {
                commission = 15;
            }
            double bonus = 0;

            if(salesAmount >= 100000 && salesAmount < 150000) {
                bonus = 2000;
            }
            else if(salesAmount >= 150000) {
                bonus = 3000;
            }
            double earned = (salesAmount * commission) / 100;
            double payout = earned + bonus;
            sum=sum+ salesAmount;
            sum1=sum1 + earned;

            if(salesAmount > maxSales) {
                maxSales = salesAmount;
                topPerformer = repName;
            }

            System.out.println("Sales Rep: " + repName);
            System.out.println("Sales Amount: $" + salesAmount);
            System.out.println("Commission Rate: " + commission + "%");
            System.out.println("Commission Earned: $" + earned);
            System.out.println("Bonus: $" + bonus);
            System.out.println("Total Payout: $" + payout);
            System.out.println();
        }

        System.out.println("Total Sales Reps: " + n);
        System.out.println("Total Sales: $" + sum);
        System.out.println("Total Commissions: $" + sum1);
        System.out.println("Top Performer: " + topPerformer);
    }
}