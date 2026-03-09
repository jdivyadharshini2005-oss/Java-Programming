package loop;
import java.util.*;
public class while8 {
    public static void main(String[]args){
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        int temp=n;
        int digit=0;
        while(temp>0){
            digit=temp%10;
            temp=temp/10;
            sum=sum+digit;
        }
        System.out.println("Number :" +n);
        System.out.println("Sum of Digits :"+sum);
    }
    
}
