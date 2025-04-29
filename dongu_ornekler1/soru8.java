package dongu_ornekler1;

import java.util.Scanner;

public class soru8 {
    public static void main(String[] args) {
        Scanner giris = new Scanner(System.in);

        int sayi1, sayi2, toplam = 0;
        char secim;

        do {

            System.out.println("Lutfen birinci sayiyi giriniz:");
            sayi1 = giris.nextInt();

            System.out.println("Lutfen ikinci sayiyi giriniz:");
            sayi2 = giris.nextInt();

            toplam = sayi1 + sayi2;
            System.out.println("sonuc:" + toplam);

            System.out.println("tekrar hesaplama yapmak isterseniz E/e tusuna basin");
            secim = giris.next().charAt(0);

        } while (secim == 'e' || secim == 'E');

        System.out.println("iyi gunler");
    }

}
