import java.util.*;
public class while18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a=sc.nextInt();
        int b = sc.nextInt();
        int mul=a*b;
        int x=a;
        int y=b;
        while(b!=0){
            int temp=b;
            b=a%b;
            a=temp;
        }
        int lcm=mul/a;
        System.out.println("LCM of " + x + " and " + y + " = " +lcm);

    }
    
}
