package dongu_ornekler1;

import java.util.Scanner;

public class soru16 {
    public static void main(String[] args) {
        Scanner giris = new Scanner(System.in);
        int sayi, toplam = 0;

        do {

            System.out.println("Sayi girin:");
            sayi = giris.nextInt();

            toplam += sayi;

        } while (toplam <= 21);

        System.out.println("Sayilarin toplami:" + toplam);
    }

}
