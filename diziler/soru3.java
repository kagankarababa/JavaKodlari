package diziler;

import java.util.Random;

public class soru3 {
    public static void main(String[] args) {

        Random rnd = new Random();

        int dizi[] = new int[20];

        int toplam = 0, ort, adet = 0;

        for (int i = 0; i < dizi.length; i++) {

            dizi[i] = rnd.nextInt(101);

            toplam += dizi[i];

        }
        ort = toplam / 20;

        for (int i = 0; i < dizi.length; i++) {

            if (dizi[i] > ort) {
                adet++;
                System.out.println(dizi[i]);
            }
        }

        System.out.println("aritmetik ortalamız:" + ort);
        System.out.println("ortalamadan buyuk sayi adetiniz:" + adet);

    }

}
