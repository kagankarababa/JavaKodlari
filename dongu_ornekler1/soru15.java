package dongu_ornekler1;

import java.util.Scanner;

public class soru15 {
    public static void main(String[] args) {
        Scanner giris = new Scanner(System.in);
        int sayi, adet = 0;

        System.out.println("Lutfen bir sayi giriniz:");
        sayi = giris.nextInt();

        for (int i = 1; i <= sayi; i++) {
            if (sayi % i == 0) {
                adet++;
            }
        }
        if (adet == 2) {
            System.out.println("Sayiniz asal sayidir.");
        } else {
            System.out.println("Sayiniz asal sayi degildir.");
        }

    }
}
