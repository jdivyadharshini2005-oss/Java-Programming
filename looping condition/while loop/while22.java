
import java.util.*;
public class while22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start=sc.nextInt();
        int end=sc.nextInt();
        int sum=0;
        int n=start;
        while(start<=end){
            if(start%2==0){
                sum=sum+start;

            }
            start++;
        }
        System.out.println("Sum of even numbers from " + n + " to" + end + " :" + sum);
        

    }
    
}
