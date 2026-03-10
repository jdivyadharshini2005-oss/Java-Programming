package loop;
import java.util.*;
public class while17 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int i=1;
        int sum=0;
        while(i<=n/2){
            if(n%i==0){
                sum=sum+i;
                
            }
            i++;
        }
        if(sum==n){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
}
}


