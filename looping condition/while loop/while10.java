package loop;
import java.util.*;
public class while10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=0;
        int b=1;
        int i=2;
        int temp=0;
        int n= sc.nextInt();
        System.out.println(a);
        System.out.println(b);
        while(i<n){
            temp=a+b;
            System.out.println(temp);
            a=b;
            b= temp;
            i++;
        }

    }
    
}
