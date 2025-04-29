package dongu_ornekler2;

import java.util.Scanner;

public class soru1 {
    public static void main(String[] args) {

        Scanner giris = new Scanner(System.in);
        int sayi;
        System.out.println("Lutfen 3 basamakli bir sayi giriniz:");
        sayi = giris.nextInt();

        for(int i=0;i<3;i++){
            System.out.print(sayi%10);

            sayi=sayi/10;
        }

    }
}

/*Scanner giris = new Scanner(System.in);
        int sayi;

        // Kullanıcıdan 3 basamaklı bir sayı girmesini iste
        System.out.println("Lütfen 3 basamaklı bir sayı giriniz:");
        sayi = giris.nextInt();

        // 3 basamaklı sayıyı kontrol et
        if (sayi >= 100 && sayi <= 999) {
            // Yüzler basamağını al
            int yuzler = sayi / 100;
            // Onlar basamağını al
            int onlar = (sayi / 10) % 10;
            // Birler basamağını al
            int birler = sayi % 10;

            // Basamakları yazdır
            System.out.println("Girilen sayının basamakları: " + yuzler + ", " + onlar + ", " + birler);
        } else {
            System.out.println("Lütfen 3 basamaklı bir sayı giriniz.");
        } */