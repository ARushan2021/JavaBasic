import java.util.Scanner;

public class Zadacha6 {
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        System.out.println("ввести массу - 1 или расстояние - 2 : ");
        int FizVelichina = in.nextInt();

        if (FizVelichina == 2) {

            Scanner in2 = new Scanner(System.in);
            System.out.println("Выберите единицу измерения: 1 - метр, 2 - миля, 3 - ярд, 4 - фут : ");
            int EdIzmer = in2.nextInt();

            Scanner in3 = new Scanner(System.in);
            System.out.println("Введите число : ");
            double Chislo = in3.nextDouble();

            if (EdIzmer == 1) {
                double Metr = Chislo;
                double Milya = Metr * 0.00062;
                double Yard = Metr * 1.09;
                double Fut = Metr * 3.28;
                System.out.println("метр - " + Metr + "\n" + "миль - " + Milya + "\n" + "ярд - " + Yard + "\n" + "фут - " + Fut);
            }
            else if (EdIzmer == 2) {
                double Milya = Chislo;
                double Metr = Milya * 1609.34;
                double Yard = Milya * 1760;
                double Fut = Milya * 5280;
                System.out.println("миль - " + Milya + "\n" + "метр - " + Metr + "\n" +  "ярд - " + Yard + "\n" + "фут - " + Fut);
            }
            else if (EdIzmer == 3) {
                double Yard = Chislo;
                double Metr = Yard * 0.91;
                double Milya = Yard * 0.00057;
                double Fut = Yard * 3;
                System.out.println("ярд - " + Yard + "\n" + "метр - " + Metr + "\n" + "миль - " + Milya + "\n"  + "фут - " + Fut);
            }
            else if (EdIzmer == 4) {
                double Fut = Chislo;
                double Yard = Fut * 0.33;
                double Metr = Fut * 0.3;
                double Milya = Fut * 0.00019;
                System.out.println("фут - " + Fut + "\n" + "метр - " + Metr + "\n" + "миль - " + Milya + "\n" + "ярд - " + Yard);
            }
        }
        else if (FizVelichina == 1) {

            Scanner in3 = new Scanner(System.in);
            System.out.println("Выберите единицу измерения: 1 - килограмм, 2 - англ.фунты, 3 - пуды, 4 - унции : ");
            int EdIzmer = in3.nextInt();

            Scanner in4 = new Scanner(System.in);
            System.out.println("Введите число : ");
            double Chislo = in4.nextDouble();

            if (EdIzmer == 1) {
                double Kilogramm = Chislo;
                double Funti = Kilogramm * 2.2;
                double Pudi = Kilogramm * 0.061;
                double Uncii = Kilogramm * 35.278;
                System.out.println("килограмм - " + Kilogramm + "\n" + "анг.фунты - " + Funti + "\n" + "пуды - " + Pudi + "\n" + "унции - " + Uncii);
            }
            else if (EdIzmer == 2) {
                double Funti = Chislo;
                double Kilogramm = Funti * 0.45;
                double Pudi = Funti * 0.028;
                double Uncii = Funti * 16;
                System.out.println("анг.фунты - " + Funti + "\n" + "килограмм - " + Kilogramm + "\n" + "пуды - " + Pudi + "\n" + "унции - " + Uncii);
            }
            else if (EdIzmer == 3) {
                double Pudi = Chislo;
                double Kilogramm = Pudi * 16.38;
                double Funti = Pudi * 36.11;
                double Uncii = Pudi * 577.79;
                System.out.println("пуды - " + Pudi + "\n" + "килограмм - " + Kilogramm + "\n" + "анг.фунты - " + Funti + "\n" + "унции - " + Uncii);
            }
            else if (EdIzmer == 4) {
                double Uncii = Chislo;
                double Kilogramm = Uncii * 0.028;
                double Funti = Uncii * 0.063;
                double Pudi = Uncii * 0.0017;
                System.out.println("унции - " + Uncii + "\n" + "килограмм - " + Kilogramm + "\n" + "анг.фунты - " + Funti + "\n" + "пуды - " + Pudi);
            }

        }
    }
}