package diziler;

import java.util.Scanner;

public class soru1 {


    public static void main(String[] args) {
        Scanner giris = new Scanner(System.in);

        int[] sicaklik = new int[7];
        int toplam = 0, ort;

        for (int i = 0; i < sicaklik.length; i++) {
            System.out.println((i + 1) + ".gun sicaklik degerini giriniz:");
            sicaklik[i] = giris.nextInt();

            toplam += sicaklik[i];
        }

        ort = toplam / 7;

        System.out.println("ortalama sicaklik degeriniz:" + ort);

    }

}
