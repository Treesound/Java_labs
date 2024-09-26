import java.util.Scanner;

public class twiceEvenNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        
        if (number < 100 || number > 999) {
            System.out.println("Некорректный ввод\n");
            return;
        }
        
        int hundreds = number / 100;
        int tens = (number / 10) % 10;
        int units = number % 10;
        int sum = hundreds + tens + units;
        int product = hundreds * tens * units;
        
        if (sum % 2 == 0 && product % 2 == 0) {
            System.out.println("Число является дважды четным");
        } else {
            System.out.println("НЕ дважды четное");
        }
        
        scanner.close();
    }
}
