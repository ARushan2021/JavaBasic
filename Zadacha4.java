import java.util.Scanner;

public class Zadacha4 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println ("Введите 3 любых числа x,y,z: ");
            double x = in.nextInt();
            double y = in.nextInt();
            double z = in.nextInt();
            double SrArif = (x+y+z) / 3;
                System.out.println("среднее арифметическое x, y, z = " + SrArif);

            double SrArif2 = Math.floor (SrArif / 2);
            if (SrArif2 > 3)
                System.out.println("Программа выполнена корректно");
    }
}