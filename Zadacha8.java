import java.util.Scanner;

public class Zadacha8 {
    public static void main(String args[]) {

        while (true) {

            Scanner in = new Scanner(System.in);
            System.out.println("Введите любое целое положительное число: ");
            int number = in.nextInt();

            if (number % 1 == 0 & number <= 0) {
                System.out.println("Введено неверное число!");
            }
            else {
                int sum = 0;
                for (int i = 1; i <= number; i++) {
                    if (0 != (i % 2)) {
                        sum += i;
                    }
                }
                System.out.println("Сумма всех нечетных чисел: " + sum);
                return;
            }
        }
    }
}