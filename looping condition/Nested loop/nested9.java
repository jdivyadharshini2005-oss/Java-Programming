import java.util.*;
public class nested9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int height = sc.nextInt();
        for(int row=1;row<=height;row++){
            for(int space=1;space<=height-row;space++){
                System.out.print("");
            }
            for(int i=1;i<=row;i++){
                System.out.print(i);
            }
            for(int i=row-1;i>=1;i--){
                System.out.print(i);
            }
            System.out.println();
        }

    }
    
}
