package diziler;

import java.util.Scanner;

public class soru6 {
    public static void main(String[] args) {
        Scanner giris = new Scanner(System.in);
        int eleman;

        System.out.println("kac elemanli bir dizi olusturmak istiyorsunuz(max 100 eleman giriniz):");
        eleman = giris.nextInt();

        int[] dizi = new int[eleman];
        int[] pdizi = new int[100];
        int psayi = 0;
        int[] ndizi = new int[100];
        int nsayi = 0;

        for (int i = 0; i < dizi.length; i++) {
            System.out.println((i + 1) + ".elemani giriniz:");
            dizi[i] = giris.nextInt();

            if (dizi[i] > 0) {
                pdizi[psayi] = dizi[i];
                psayi++;
            }

            if (dizi[i] < 0) {
                ndizi[nsayi] = dizi[i];
                nsayi++;
            }
        }

        System.out.println("pozitif elemanlariniz:");
        for (int i = 0; i < psayi; i++) {
            System.out.println(pdizi[i]);

        }
        System.out.println("negatif elemanlariniz:");
        for (int i = 0; i < nsayi; i++) {
            System.out.println(ndizi[i]);

        }

    }

}
