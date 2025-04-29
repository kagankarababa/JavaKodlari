package dongu_ornekler2;

import java.util.Scanner;

public class soru6 {
    public static void main(String[] args) {
        Scanner giris = new Scanner(System.in);

        double x, y, yfak = 1, xfak = 1, xyfak = 1, sonuc;

        System.out.println("x degerini giriniz:");
        x = giris.nextDouble();

        System.out.println("y degerini giriniz:");
        y = giris.nextDouble();

        if (x > y && x > 0 && y > 0) {

            for (int i = 1; i <= y; i++) {
                yfak = i * yfak;

            }
            for (int i = 1; i <= x; i++) {
                xfak = i * xfak;
            }
            for (int i = 1; i <= (x - y); i++) {
                xyfak = i * xyfak;
            }

            sonuc = xfak / (yfak * xyfak);
            System.out.println("Sonuc: " + sonuc);

        } else {
            System.out.println("x ve y yanlis giris yapildi");
        }

    }

}
