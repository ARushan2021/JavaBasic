import java.util.Scanner;

public class ItogovayaZadacha3 {
    public static void main(String[] args) {
        System.out.println("Количество строк: ");
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        int n = Integer.parseInt(str);
        if (n < 1) {System.out.print("Введены некорректные данные!"); return;}

        Scanner in = new Scanner(System.in);
        String[] strings = new String[n];
        for (int i=0; i<n; i++) {
            System.out.print("строка " + (i + 1) + ": ");
            strings[i] = in.next();
        }
        in.close();
        sc.close();
        int x = 0;
        long max = strings[0].chars().distinct().count();
        for (int i=0; i<n; i++) {
            if (max < strings[i].chars().distinct().count()){
                max = strings[i].chars().distinct().count();
                x = i;
            }
        }
        System.out.print("Ответ: " + strings[x]);
    }
}