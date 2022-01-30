import java.util.Arrays;
import java.util.Random;

public class Zadacha14 {
    public static void main(String[] args) {
        int[] myArray = new int[15];
        for (int i = 0; i < myArray.length; i++) {
            myArray[i] = (int) ((Math.random() * 40) - 20);
        }
        Arrays.sort(myArray);
        int min = myArray[0];
        int i = myArray.length-1;
        int max = myArray[i];

        System.out.println("Максимальный элемент : " + max);
        System.out.println("Минимальный элемент : " + min);
        System.out.println("Наиболшее из минимального и максимального элемента по модулю: " + ((Math.max(Math.abs(max), Math.abs(min)))));
    }
}