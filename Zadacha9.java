import java.util.Arrays;
import java.util.Scanner;

public class Zadacha9 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int size = in.nextInt();

        Double[] array = new Double[size];

        System.out.println("Введите " + size + " данных в массив: ");
        for (int i = 0; i < size; i++) {
            array[i] = in.nextDouble();
        }
        double sum = 0;
        for (double element : array)
            sum += element;
        double SrArif = sum / (array.length);

        for(int i=0; i<array.length; i++) {
            array[i] = array[i] * SrArif;
        }
        System.out.println("Каждый элемент массива умножен на среднеее арифметическое '" + SrArif + "' : " + Arrays.toString(array));
    }

}
