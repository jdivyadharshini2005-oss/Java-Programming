package loop;
import java.util.*;
public class while14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int temp=n;
        int sum=0;
        while(n>0){
            int digit=n%10;
            sum = sum+digit*digit*digit;
            n=n/10;

        }
        if(sum==temp){
            System.out.println(temp+" is an Amstrong number");
        }
        else{
            System.out.println(temp +" is Not an amstrong number");
        }
    }
    
}
