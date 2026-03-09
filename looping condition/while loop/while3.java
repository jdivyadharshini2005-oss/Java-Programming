package loop;
import java.util.*;
public class while3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int secret = sc.nextInt();
        int guess=0;
        int attempt=0;
        while(secret!=guess){
            guess=sc.nextInt();
            System.out.println("Guess the number (1100) : " +guess);
            attempt++;
        }
        if(secret>guess){
            System.out.println("Too high!");
        }
        else if(secret<guess){
            System.out.println("Too low!");
        }
        else{
            System.out.println("Correct!" + "Attempt : " + attempt);
        }
    }
    
}
