package dongu_ornekler1;

import java.util.Random;
import java.util.Scanner;

public class soru23 {
    public static void main(String[] args) {
        Scanner giris = new Scanner(System.in);
        Random rnd = new Random();
        int sayi1, sayi2, toplam = 0, cevap;

        char secenek;

        do {

            sayi1 = rnd.nextInt(100) + 1;
            sayi2 = rnd.nextInt(100) + 1;
            toplam = sayi1 + sayi2;

            System.out.println(sayi1 + " + " + sayi2 + " = ?");

            System.out.print("Cevabiniz:");
            cevap = giris.nextInt();

            if (cevap == toplam) {
                System.out.println("Tebrikler Bildiniz:)");
            } else {
                System.out.println("Uzgunuz Bilemediniz:(");
            }

            System.out.println("Tekrar oynamak ister misiniz(e/E)");
            secenek = giris.next().charAt(0);

        } while (secenek == 'e' || secenek == 'E');

    }

}
