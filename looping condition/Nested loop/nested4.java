import java.util.*;
public class nested4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int students = sc.nextInt();
        int subjects = sc.nextInt();
        for(int i = 1; i <= students; i++) {
            String name = sc.next();
            int sum = 0;
            System.out.printf("%-10s ", name);
            for(int j = 1; j <= subjects; j++) {
                int mark = sc.nextInt();
                sum = sum + mark;
                System.out.printf("%5d", mark);
            }
            double avg = (double)sum / subjects;
            System.out.printf("  Avg: %.2f", avg);
            System.out.println();
        }
    }
}