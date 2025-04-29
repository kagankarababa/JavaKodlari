package dongu_ornekler2;

import java.util.Scanner;

public class soru4 {
    public static void main(String[] args) {
        Scanner giris = new Scanner(System.in);
        int fak = 1, sayi = 0;

        while (sayi >= 0) {

            System.out.println("Lutfen bir sayi giriniz:");
            sayi = giris.nextInt();
            fak = 1;

            if (sayi >= 0) {

                for (int i = 1; i <= sayi; i++) {
                    fak = fak * i;
                }
                System.out.println("faktoriyel: " + fak);

            }

        }
    }

}
