package loop;
import java.util.*;
public class while12 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int temp=0;
        int rev=0;
        int copy=n;
        while(n>0){
            temp=n%10;
            rev=rev*10+temp;
            n=n/10;
        }
        if(rev==copy){
            System.out.println(copy+" is a Palindrome");
        }
        else {
            System.out.println(copy + " is Not a palindrome");
        }
    }
    
}
