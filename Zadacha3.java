public class Zadacha3 {
    public static void main(String args[]) {
        int[] array1 = {110, 120, 130, 140, 150};
        int a = array1[0];
        int b = array1[array1.length - 1];
        array1[0] = b;
        array1[array1.length - 1] = a;
        System.out.println("Результат суммы первого и среднего элемента: " + (array1[0]+array1[array1.length - 3]));
    }
}