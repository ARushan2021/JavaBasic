import java.util.Scanner;

public class ItogovayaZadacha1 {
    public static void main(String args[]) {
        System.out.println("Введите текущий курс доллара: ");
        Scanner in = new Scanner(System.in);
        Double ex = in.nextDouble();

        System.out.println("Введите колличество рублей: ");
        Double rub = in.nextDouble();

        System.out.println("Итого: " + String.format("%.2f", rub / ex) + " долларов");
    }
}
