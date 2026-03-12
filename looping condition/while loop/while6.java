import java.util.*;
public class while6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int balance=sc.nextInt();
        int amount=0;
        do{
            System.out.println("Enter withdrawal Amount : ");
            amount=sc.nextInt();
        if(amount>balance){
            System.out.println("Insuffient funds!Try again");
        }
    }
    while(amount>balance);
    balance=balance-amount;
    System.out.println("Withdrawal successful! Remaining balance : " +balance);

    }


    }
    


