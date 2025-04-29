package diziler;

import java.util.Random;

public class soru2 {
    public static void main(String[] args) {

        int[] dizi = new int[100];

        Random rnd = new Random();

        int toplam = 0, ort, adet = 0,sayac=0;;

        
        for (int i = 0; i < dizi.length; i++) {
            dizi[i] = rnd.nextInt(200)+1;

            if (dizi[i] > 100) {
                
                sayac++;
            }

            else if (dizi[i] < 100) {
                toplam += dizi[i];
                adet++;
            }
        }

        System.out.println("********************************");

        ort = toplam / adet;
        System.out.println("100 den büyük sayilarin sayisi:"+sayac);
        System.out.println("100 den kucuk sayıların ortalaması:" + ort);
        System.out.println(toplam);
        System.out.println(adet);
        

        System.out.println("********************************");

        for (int i = 0; i < dizi.length; i++) {

            if (dizi[i] % 2 == 0) {
                System.out.println("cift sayilar:" + dizi[i]);
            }
        }
    }

}
