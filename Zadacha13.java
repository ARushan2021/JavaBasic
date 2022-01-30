import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Zadacha13 {
    public static void main(String[] args) {
        System.out.println("Введите строку 'I love java 8 Я люблю java 14 core1':");
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
        String[] strArray = str.split(" ");
        byte l = 0;
        for (int i = 0; i < strArray.length; i++) {
            Pattern p = Pattern.compile("^[a-zA-Z0-9]+$");
            Matcher m = p.matcher(strArray[i]);
            if (m.find()) {
                System.out.println(strArray[i] + " ");
                l++;
            }
        }
        System.out.println("Количество слов на латиницы: " + l);
    }
}