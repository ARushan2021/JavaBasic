import java.util.Scanner;

public class Zadacha11 {
    public static void main(String args[]) {
        System.out.println("Введите первое число: ");
        Scanner in = new Scanner(System.in);
        Integer x = in.nextInt();
        String a = Integer.toString(x);

        System.out.println("Введите второе число: ");
        int y = in.nextInt();
        int result = x.compareTo(y);

        if (result == 1) {
            System.out.println("Большее число: " + x);
            System.out.print("Меньшее число: " + (double) y);
        } else if (result == 0) {
            System.out.println("Числа " + x + " " + y + " равны");
        } else {
            System.out.println("Большее число: " + y);
            System.out.print("Меньшее число: " + x.doubleValue());
        }

    }
}

