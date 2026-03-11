import java.util.*;
public class while15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int count=0;
        do{
            System.out.print (" "  +n );
            if(n%2==0){
                n=n/2;
            }
            else{

                n=3*n+1;
            }
            count++;
        }
        while(n!=1);
        System.out.println( " "+1);
        System.out.println(count);

    }
    
}
