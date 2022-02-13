import java.util.Scanner;

public class ItogovayaZadacha4 {
    public static void main(String[] args) {
        System.out.println("Сидит дед, во стоо шуб одет, кто его раздевает, тот слезы проливает");
        int var = 1;
        do {
            System.out.println("Ответ: ");
            Scanner scan = new Scanner(System.in);
            String str = scan.nextLine();
            if (var == 1 & str.equalsIgnoreCase("Подсказка")) {
                System.out.println("Подсказка: не растет в огороде");
                var++;
            } else if (var != 1 & str.equalsIgnoreCase("Подсказка")) {
                System.out.println("Подсказка уже недоступна");
            } else if (!(str.equalsIgnoreCase("Заархивированный вирус"))) {
                if (var == 3) {
                    System.out.println("Обидно, приходи в другой раз");
                } else {
                    System.out.println("Подумай еще!");
                }
                var++;
            } else {
                System.out.println("Правильно!");
                var = 4;
            }
        } while (var < 4);
    }
}