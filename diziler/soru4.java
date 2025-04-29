package diziler;

import java.util.Random;

public class soru4 {
    public static void main(String[] args) {

        Random rnd = new Random();

        int[] dizi = new int[5];
        int enBuyuk = 0, enKucuk = 100;

        double toplam = 0, ort;

        for (int i = 0; i < dizi.length; i++) {
            dizi[i] = rnd.nextInt(101);

            toplam += dizi[i];

            if (dizi[i] > enBuyuk) {
                enBuyuk = dizi[i];

            }

            if (dizi[i] < enKucuk) {
                enKucuk = dizi[i];

            }
            System.out.println(dizi[i]);
        }
        System.out.println("*********************");
        ort = toplam / 5;
        System.out.println("sayisal ortalaminiz:" + ort);
        System.out.println("dizinin en buyuk elemani:" + enBuyuk);
        System.out.println("dizinin en kucuk elemani:" + enKucuk);

    }

}
