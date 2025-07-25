import java.util.Scanner;
public class DigitSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Author:Merin Anna Johns
        System.out.print("Enter a four-digit number: ");
        int number = sc.nextInt();
        if (number < 1000 || number > 9999) {
            System.out.println("Invalid input. Please enter a four-digit number.");
        } else {
            int sum = 0;
            while (number != 0) {
                int digit = number % 10; 
                sum += digit;            
                number /= 10;            
            }
            System.out.println("Sum of digits = " + sum);
        }
    }
}