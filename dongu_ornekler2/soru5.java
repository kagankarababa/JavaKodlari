package dongu_ornekler2;

import java.util.Scanner;

public class soru5 {
    /*public static void main(String[] args) {
        Scanner giris = new Scanner(System.in);
        int sayi, kalan = 0, toplam = 0;

        for (int i = 100; i <= 999; i++) {

            sayi = i;

            kalan = i % 10;
            toplam = kalan * kalan * kalan;

            sayi = i / 10;
            kalan = sayi % 10;
            toplam = toplam + kalan * kalan * kalan;

            sayi = sayi / 10;
            kalan = sayi % 10;
            toplam = toplam + kalan * kalan * kalan;

            if (toplam == i) {
                System.out.println(i);
            }

        }

    }*/

    public static void main(String[] args) {
        // 3 basamaklı sayıları kontrol etmek için döngü
        for (int sayi = 100; sayi < 1000; sayi++) {
            // Basamaklara ayırma
            int birler = sayi % 10;  // Birler basamağı
            int onlar = (sayi / 10) % 10;  // Onlar basamağı
            int yuzler = sayi / 100;  // Yüzler basamağı

            // Her basamağın küplerini topla
            int toplam = (yuzler * yuzler * yuzler) + (onlar * onlar * onlar) + (birler * birler * birler);

            // Eğer toplam sayıya eşitse, Armstrong sayısıdır
            if (toplam == sayi) {
                System.out.println(sayi + " bir Armstrong sayısıdır.");
            }
        }
    }

}
