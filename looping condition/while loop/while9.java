package loop;
import java.util.*;
public class while9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int flag=0;
        int i=2;
        while(i<n){
        while(n%i==0){
            flag=1;
            break;
        }
        i++;
    }
        if(flag==0){
            System.out.println( n +" is Prime");
        }
        else{
            System.out.println( n + " is not prime");
        }
    }
    
}
