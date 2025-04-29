package diziler;

import java.util.Random;
import java.util.Scanner;

public class degisik {
    /*
     * ilk olarak bir metodumuz olsun, bu metotta 5 kişilik bir string dizimiz
     * oluşturulsun verileri kullanıcı girsin.
     * bir metodumuz daha olucak bu metodda random sınıfı ile 0-4 arası bir değer
     * döndürülücek.
     * son olarak bir metodumuz daha olucak bu metod parametre olarak random
     * sınıfından random değeri ve string metodundan
     * elemanların girili olduğu diziyi alıcak
     * bu son metodumuzda random sınıfından gelen index no ile string dizisinin o
     * indexdeki elemanını alıcağız
     * bu elemanın pallindrom kelime olup olmadığını kontrol edip. kullanıcıya x
     * indeksi ... kelimeniz pallindordumdru
     * yada değildir diye bilgi vericeğiz
     */

    public static void main(String[] args) {

        

        palliMi(isimler(), oylesine());

    }

    public static String[] isimler() {
        Scanner giris = new Scanner(System.in);
        String[] isim = new String[5];
        for (int i = 0; i < isim.length; i++) {
            System.out.println((i + 1) + ". ismi giriniz:");
            isim[i] = giris.nextLine();
        }

        return isim;

    }

    public static int oylesine() {
        Random rnd = new Random();

        return rnd.nextInt(5);

    }

    public static void palliMi(String[] dizi, int sayi) {
        Scanner giris = new Scanner(System.in);

        String kelime = dizi[sayi];
        int uzunluk = kelime.length();
        boolean mi = true;

        System.out.println(kelime);

        for (int i = 0; i < uzunluk; i++) {

            if (kelime.charAt(i) != kelime.charAt(uzunluk - 1 - i)) {
                mi = false;
                break;
            }

        }
        if (mi == true) {
            System.out.println("Palli");
        } else {
            System.out.println("Diil");
        }

        char evet;
        System.out.println("Devam mi?");

        evet = giris.next().charAt(0);

        if (evet == 'e')
            palliMi(dizi, oylesine());

    }

}
