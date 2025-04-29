package diziler;

import java.util.Random;

public class soru5_2 {
    public static void main(String[] args) {

        Random rnd = new Random();

        int[] dizi = new int[10];

        int adet = 0, toplam = 0, ort = 0;

        for (int i = 0; i < dizi.length; i++) {

            dizi[i] = rnd.nextInt(101);
        
            if (dizi[i] % 5 == 0 && dizi[i] % 3 != 0) {

                adet++;
                System.out.println("sayi:"+dizi[i]);
                toplam += dizi[i];
            }
        

        } 
        ort = toplam / adet;
        System.out.println("adetiniz."+adet);
        System.out.println("ort:" + ort);
        System.out.println("toplam:" + toplam);

    }

}
