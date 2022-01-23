import java.util.Scanner;

    public class Zadacha5 {
        public static void main(String args[]) {
            Scanner in = new Scanner(System.in);
            System.out.println("Введите 2 любых числа : ");
            double a = in.nextDouble();
            double b = in.nextDouble();

            Scanner in2 = new Scanner(System.in);
            System.out.println("Введите один из симфолов  ‘+’, ‘-’, ‘*’ или ‘/’ : ");
            String c = in2.nextLine();

            double Rezultat = 0;
            switch (c) {
                case "-":
                    Rezultat = a - b;
                    break;
                case "+":
                    Rezultat = a + b;
                    break;
                case "*":
                    Rezultat = a * b;
                    break;
                case "/":
                    Rezultat = a / b;
                    break;
            }
            System.out.println("равно = " + Rezultat);

        }
    }
