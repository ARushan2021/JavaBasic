import java.util.Scanner;

public class ItogovayaZadacha2 {
    public static void main(String args[]) {
        System.out.println("Ввод: ");
        Scanner in = new Scanner(System.in);

        String[] array = new String[5];
        for (int i = 0; i < array.length; i++) {array[i] = in.next();}

        boolean ar1; ar1 = (array[0].equals("x") || array[0].equals("0") || array[0].equals("1") || array[0].equals("2") || array[0].equals("3") || array[0].equals("4") || array[0].equals("5") || array[0].equals("6") || array[0].equals("7") || array[0].equals("8") || array[0].equals("9"));
        boolean ar2; ar2 = (array[1].equals("+") || array[1].equals("-"));
        boolean ar3; ar3 = (array[2].equals("x") || array[2].equals("0") || array[2].equals("1") || array[2].equals("2") || array[2].equals("3") || array[2].equals("4") || array[2].equals("5") || array[2].equals("6") || array[2].equals("7") || array[2].equals("8") || array[2].equals("9"));
        boolean ar4; ar4 = array[3].equals("=");
        boolean ar5; ar5 = (array[4].equals("x") || array[4].equals("0") || array[4].equals("1") || array[4].equals("2") || array[4].equals("3") || array[4].equals("4") || array[4].equals("5") || array[4].equals("6") || array[4].equals("7") || array[4].equals("8") || array[4].equals("9"));
        boolean arX; arX = (array[0].equals("x") ^ array[2].equals("x") ^ array[4].equals("x"));

        int result = 0;

        if (ar1 & ar2 & ar3 & ar4 & ar5 & arX) {
            if (array[1].equals("+")) {
               if (array[0].equals("x")) {result = Integer.parseInt(array[4]) - Integer.parseInt(array[2]);}
               else if (array[2].equals("x")) {result = Integer.parseInt(array[4]) - Integer.parseInt(array[0]);}
               else if (array[4].equals("x")) {result = Integer.parseInt(array[0]) + Integer.parseInt(array[2]);}
            }
            else if (array[1].equals("-")){
                if (array[0].equals("x")) {result = Integer.parseInt(array[2]) + Integer.parseInt(array[4]);}
                else if (array[2].equals("x")){result = Integer.parseInt(array[0]) - Integer.parseInt(array[4]);}
                else if (array[4].equals("x")){result = Integer.parseInt(array[0]) - Integer.parseInt(array[2]);}
            }
            System.out.println("Вывод : " + result);
        }
        else {System.out.println("не верный формат");}
    }

}








