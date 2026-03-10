package loop;
import java.util.*;
public class while16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int binary = sc.nextInt();
        int sum=0;
        int power=1;
        while(binary>0){
            int digit=binary%10;
            sum=sum+digit*power;
            power+=2;
            binary=binary/10;
        }
        System.out.println(sum);

    }
    
}
