package loop;
import java.util.*;
public class while13 {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int base = sc.nextInt();
        int exponent = sc.nextInt();
        int result=1;
        int n=exponent;
        while(exponent>0){
            result=result*base;
            exponent--;
        }
        System.out.println((base + " ^ " + n) +" = " + result);

    }
    
}
