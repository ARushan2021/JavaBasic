import java.util.Scanner;

public class Zadacha10 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите ширину и длинну матрицы: ");
        int y = in.nextInt();
        int x = in.nextInt();

        System.out.println("Введите " + (y * x) + " данных(ую) матрицы: ");
        int[][] array = new int[y][x];
        Scanner in2 = new Scanner(System.in);
        for (int i = 0; i < y; i++) {
            array[i] = new int[x];
            for (int j = 0; j < x; j++) {
                array[i][j] = in2.nextInt();
            }
        }
        System.out.print("Первая строчка матрицы умноженная на 3 : ");
        for (int i = 0; i < x; i++) {
            System.out.print((array[0][i] * 3) + " ");
        }
    }
}
