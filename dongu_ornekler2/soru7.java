package dongu_ornekler2;

import java.util.Scanner;

public class soru7 {
    public static void main(String[] args) {
        Scanner giris = new Scanner(System.in);
        double a, m, z, sonuc=0;

        System.out.println("a degerini giriniz:");
        a = giris.nextInt();

        System.out.println("m degerini giriniz:");
        m = giris.nextInt();

        System.out.println("z degerini giriniz:");
        z = giris.nextInt();

        for (int i = 1; i <= m; i++) {

            sonuc = sonuc + (a / i) * Math.pow((z - a), i);
        }
        System.out.println("sonuc: "+sonuc);

    }

}
