import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int start = scanner.nextInt(); // дописать код;
        int end = scanner.nextInt();   // дописать код;
        for (int i = start; i <= end; i++) {
            if ((i%5) == 0 && (i%3) == 0) {
                System.out.print(" FizzBuzz ");
            } else if (i%3 == 0) {
                System.out.print(" Fizz ");
            } else if (i%5 == 0) {
                System.out.print(" Buzz ");
            } else {
                System.out.print(i + " ");
            }
        }
    }
} // я это сделал буквально за 5 минут XD
