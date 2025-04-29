package dongu_ornekler1;

import java.util.Scanner;

public class soru13 {
    public static void main(String[] args) {
        Scanner giris = new Scanner(System.in);
        int sayi, toplam = 0;

        System.out.println("Lutfen bir sayi giriniz:");
        sayi = giris.nextInt();

        for (int i = 1; i < sayi; i++) {
            if (sayi % i == 0) {
                toplam += i;
            }

        }
        if (toplam == sayi) {

            System.out.println("Girdiginiz sayi mukemmel sayidir.");

        } else {
            System.out.println("Girdiginiz sayi mukemmel sayi degildir.");
        }

    }

}
