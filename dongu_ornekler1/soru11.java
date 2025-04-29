package dongu_ornekler1;

import java.util.Scanner;

public class soru11 {
    public static void main(String[] args) {
        Scanner giris = new Scanner(System.in);
        int sayi;

        System.out.println("Lutfen bir sayi giriniz:");
        sayi = giris.nextInt();

        System.out.println("sayinizin tam bolenleri:");

        for (int i = 1; i <= sayi; i++) {

            if (sayi % i == 0) {
                System.out.println(i);
            }

        }
    }

}
