package loop;
import java.util.*;
public class while11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int x=a;
        int y=b;
        while(b!=0){
            int temp=b;
            b=a%b;
            a=temp;
        }
        System.out.println("GCD of " +  x + " and "+ y +" = " +a);
    }
    
}
