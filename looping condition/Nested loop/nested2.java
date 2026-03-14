import java.util.*;
public class nested2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m=sc.nextInt();
        int i;
        int j;
        for(i=1;i<=n;i++){
            System.out.print("Row" + i +":");
            for(j=1;j<=m;j++){
                System.out.print("Seat" + j +" ");
            }
            System.out.println();
            
        }
        int total=n*m;
        System.out.println(total);

    }
    
}
