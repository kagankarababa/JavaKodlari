package dongu_ornekler1;

import java.util.Random;
import java.util.Scanner;

public class soru14 {
    public static void main(String[] args) {
        Scanner giris = new Scanner(System.in);
        Random rnd = new Random();
        int sayi, tahmin;

        sayi = rnd.nextInt(100)+1;//1-100 arası demek (1 ile 100 dahil)
        //(100) yapsaydık 0 dahil 100 hariç olurdu.

        //BU SORU DO-WHİLE İLE YAPILABİLİR DAHA İYİ OLUR.

        System.out.println("Bir sayi tuttum hadi bil bakalim:)");

        for (int i = 0; i < 100; i++) {
            tahmin = giris.nextInt();

            if (tahmin == sayi) {
                System.out.println("Tebrikler Bildiniz:)");
                break;
            } else if (tahmin > sayi) {
                System.out.println("Asagi");
            } else if (tahmin < sayi) {
                System.out.println("Yukari");
            }

        }

    }
}
