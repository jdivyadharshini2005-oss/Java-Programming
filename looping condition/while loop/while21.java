import java.util.*;
public class while21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int i=1;
        do{
            System.out.println( n +"X" + i +" = " + n*i);
            i++;
        }
        while(i<=10);
    }
    
}
