import java.util.Scanner;

public class ItogovayaZadacha2 {
    public static void main(String args[]) {
        System.out.println("Ввод: ");
        Scanner in = new Scanner(System.in);
        String st = in.nextLine();

        String str = st.replaceAll(" ", "");

        boolean val = (str.length() == 5) ;
        int a = Character.getNumericValue(str.charAt(0));
        boolean val1 = str.startsWith("x") || a >= 0 & a <= 9;
        boolean val2 = (str.charAt(1) == '+') || (str.charAt(1) == '-');
        int b = Character.getNumericValue(str.charAt(2));
        boolean val3 = str.charAt(2) == 'x' || b >= 0 & b <= 9;
        boolean val4 = str.charAt(3) == '=';
        int c = Character.getNumericValue(str.charAt(4));
        boolean val5 = str.endsWith("x") || c >= 0 & c <= 9;
        boolean valX = str.startsWith("x") ^ str.charAt(2) == 'x' ^ str.endsWith("x");

        int result = 0;

        if (val & val1 & val2 & val3 & val4 & val5 & valX) {
            if (str.charAt(1) == '+') {
                if (str.startsWith("x")) {result = c - b;}
                else if (str.charAt(2) == 'x') {result = c - a;}
                else if (str.endsWith("x")) {result = a + b;}
            }
            else if (str.charAt(1) == '-'){
                if (str.startsWith("x")) {result = b + c;}
                else if (str.charAt(2) == 'x'){result = a - c;}
                else if (str.endsWith("x")){result = a - b;}
            }
            System.out.println("Вывод : " + result);
        }
        else {System.out.println("не верный формат");}

    }
}








