package dongu_ornekler1;

import java.util.Scanner;

public class soru21 {
    public static void main(String[] args) {

        Scanner giris = new Scanner(System.in);
        int sayi, ort = 0, toplam = 0;

        for (int i = 1; i <= 5; i++) {

            System.out.println(i + ".sayiyi giriniz:");
            sayi = giris.nextInt();

            toplam += i;
            // adet++;

        }
        ort = toplam / 5;
        System.out.println("ort:" + ort);

    }
}
