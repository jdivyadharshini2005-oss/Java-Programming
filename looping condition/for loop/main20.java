package loop;
import java.util.*;
public class main20{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double dep=0, wit=0, tra=0, pay=0;
        for(int i=1;i<=n;i++){
            String type = sc.next();
            double amt = sc.nextDouble();
            String category;
            if(type.equals("Deposit")){
                dep += amt;
                category = "Credit";
            }
            else if(type.equals("Withdrawal")){
                wit += amt;
                category = "Debit";
            }
            else if(type.equals("Transfer")){
                tra += amt;
                category = "Debit";
            }
            else{
                pay += amt;
                category = "Debit";
            }

            System.out.println("Transaction " + i + ": " + type);
            System.out.println("Category: " + category);
            System.out.println("Amount: " + amt);
        }

        double net = dep - (wit + tra + pay);
        System.out.println("Total Deposits: " + dep);
        System.out.println("Total Withdrawals: " + wit);
        System.out.println("Total Transfers: " + tra);
        System.out.println("Total Payments: " + pay);

        if(net>=0)
            System.out.println("Net Balance Change: +" + net);
        else
            System.out.println("Net Balance Change: " + net);
    }
}
