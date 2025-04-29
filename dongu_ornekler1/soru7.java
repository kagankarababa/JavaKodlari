package dongu_ornekler1;

import java.util.Scanner;

public class soru7 {
    public static void main(String[] args) {

        Scanner giris = new Scanner(System.in);
        int sayi = 1, toplam = 0, adet = 0;

        while (sayi > 0) {
            System.out.println("Lutfen bir sayi giriniz");
            sayi = giris.nextInt();
            if (sayi > 10) {
                toplam += sayi;
                adet++;
            }

        }
        System.out.println("toplamınız:"+toplam);
        System.out.println("adetiniz:"+adet);

    }

}
