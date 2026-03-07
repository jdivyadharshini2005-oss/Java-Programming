package loop;
import java.util.*;
public class main6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double initial_balance = sc.nextDouble();
        int n = sc.nextInt();
        double balance = initial_balance;
        int success = 0;
        int failure = 0;
        double withdrawn = 0;
        for(int i = 1; i <= n; i++){
            double withdrawal = sc.nextDouble();
            System.out.println("Transaction " + i + ": $" + withdrawal);
            if(withdrawal <= balance){
                System.out.println("Status: Approved");
                balance = balance - withdrawal;
                withdrawn = withdrawn + withdrawal;
                success++;
            }
            else{
                System.out.println("Status: Denied");
                System.out.println("Reason: Insufficient funds");
                failure++;
            }
            System.out.println("Remaining Balance: $" + balance);
        }
        System.out.println("Total Transactions: " + n);
        System.out.println("Successful Withdrawals: " + success);
        System.out.println("Failed Withdrawals: " + failure);
        System.out.println("Final Balance: $" + balance);
        System.out.println("Total Withdrawn: $" + withdrawn);
    }
}