package dongu_ornekler1;

import java.util.Scanner;

public class soru20 {
    public static void main(String[] args) {
        Scanner giris = new Scanner(System.in);
        int sayi, nadet = 0, ptop = 0;

        for (int i = 1; i <= 10; i++) {

            System.out.println(i + ".sayiyi giriniz:");
            sayi = giris.nextInt();

            if (sayi > 0) {
                ptop += sayi;
            } else {
                nadet++;
            }

        }

        System.out.println("Pozitif sayilarin toplami:" + ptop);
        System.out.println("Negatif sayilarin adeti:" + nadet);
    }

}
