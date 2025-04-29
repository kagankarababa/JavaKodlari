package metot;

import java.util.Scanner;

public class ornek6 {

    // Klavyeden girilen 2 sayı arasındaki
    // sayılardan 5 in katlarını ekrana
    // yazdıran bir metot yazınız.

    public static void main(String[] args) {

        Scanner giris = new Scanner(System.in);
        int sayi3, sayi4;
        System.out.println("1. sayiyi giriniz:");
        sayi3 = giris.nextInt();
        System.out.println("2. sayiyi giriniz:");
        sayi4 = giris.nextInt();

        besinKatlari(sayi3, sayi4);

    }

    public static void besinKatlari(int sayi1, int sayi2) {

        for (int i = sayi1; i <= sayi2; i++) {
            if (i % 5 == 0) {
                System.out.println(i);
            }
        }

    }

}
