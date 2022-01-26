import java.util.Scanner;

public class Zadacha7 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int size = in.nextInt();

        int [] array = new int[size];

        System.out.println("Введите " + size + " данных в массив: ");
        for (int i = 0; i < size; i++) {
            array[i] = in.nextInt();
        }

        final int X = 10;
        final int Y = 20;
        final int Z = 30;

        for (int index = 0; index < array.length; index++) {
            if (array[index] == X || array[index] == Y || array[index] == Z) {
                System.out.println("Данное значение имеется в константах");
                break;
            }
        }
    }
}

