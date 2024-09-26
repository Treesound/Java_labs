import java.util.Scanner;

public class alternatingSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
      
        int sum = 0;
        boolean add = true; 

        for (int i = 0; i < n; i++) {
            int number = scanner.nextInt();
            if (add) {
                sum += number;
            } else {
                sum -= number;
            }
            add = !add;
        }
        
        System.out.println(sum);
    }
}
