package dongu_ornekler1;

import java.util.Scanner;

public class soru10 {
    public static void main(String[] args) {
        Scanner giris = new Scanner(System.in);
        int kuvvet, sayi, sonuc=1;

        System.out.println("sayi giriniz:");
        sayi = giris.nextInt();
        

        System.out.println("kuvvetini giriniz:");
        kuvvet = giris.nextInt();

        for (int i = 1; i <=kuvvet; i++) {

            sonuc *= sayi;

            System.out.println("sonuc=" + sonuc);
            System.out.println("sayi=" + sayi);

        }
        System.out.println("****************");
        System.out.println("sonuc:" + sonuc);
    }

}
