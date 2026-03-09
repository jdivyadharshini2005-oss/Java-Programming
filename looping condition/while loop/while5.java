package loop;
import java.util.*;
public class while5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int temp=n;
        int rev=0;
        int digit=0;
        while(temp>0){
            digit=temp%10;
            rev=rev*10+digit;
            temp=temp/10;
        }
        System.out.println("Original : " +n);
        System.out.println("Reversed : " +rev);
    }
    
}
