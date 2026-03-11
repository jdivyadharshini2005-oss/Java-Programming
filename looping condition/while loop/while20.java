
import java.util.*;
public class while20 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int copy=n;
        int sum=0;
        while(n!=0){
            int temp=n%10;
            int fact=1;
            for(int i=1;i<=temp;i++){
                fact=fact*i;
            }
            sum=sum+fact;
            n=n/10;

        }
        if(copy==sum){
            System.out.println(copy +" is a strong number");
        }
        else{
            System.out.println(copy + " is not a strong number");
        }
    }
    
}
