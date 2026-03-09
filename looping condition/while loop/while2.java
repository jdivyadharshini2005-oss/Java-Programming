package loop;
import java.util.*;
public class while2 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n=1;
        int sum=0;
        int count=0;
        while(n!=0){
            n=sc.nextInt();
            System.out.println("Enter number(0 to stop):" +n);
            if(n!=0){
                sum=sum+n;
                count++;
            }

        }
        System.out.println("Sum : " +sum);
        System.out.println("Count : " +count);
    }
    
}
