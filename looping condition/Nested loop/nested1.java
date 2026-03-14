import java.util.*;
public class nested1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int i;
        int j;
        for(i=1;i<=n;i++){
            for(j=1;j<=m;j++){
            int value=i*j;
            System.out.printf("%4d" ,value);
            }
            
            System.out.println();

        }
        
    }
    
}
