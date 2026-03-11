import java.util.*;
public class while19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int decimal=sc.nextInt();
        int binary=1;
        int sum=0;
        while(decimal>0){
            int digit=decimal%2;
            sum=sum+digit*binary;
            binary*=10;
            decimal=decimal/2;
        }
        System.out.println(sum);

    }
    
}
