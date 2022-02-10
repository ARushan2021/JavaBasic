import java.util.Scanner;

public class Zadacha11 {
    public static void main(String args[]) {
        System.out.println("Введите первое число: ");
        Scanner in = new Scanner(System.in);
        String str = in.next();

        System.out.println("Введите второе число: ");
        int y = in.nextInt();

       int x = Integer.parseInt(str);

        if (x > y) {
            System.out.println("Большее число: " + x);
            System.out.print("Меньшее число: " + (double) y);
        } else if (x == y) {
            System.out.println("Числа " + x + " " + y + " равны");
        } else {
            System.out.println("Большее число: " + y);
            System.out.print("Меньшее число: " + (double) x);
        }
    }
}

