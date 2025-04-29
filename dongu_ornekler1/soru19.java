package dongu_ornekler1;

import java.util.Scanner;

public class soru19 {
    public static void main(String[] args) {
        Scanner giris = new Scanner(System.in);
        int is, ss;

        System.out.println("Ilk sayiyi giriniz:");
        is = giris.nextInt();

        System.out.println("Son sayiyi giriniz:");
        ss = giris.nextInt();

        for (int i = is; i <= ss; i++) {
            if (i % 2 == 0) {
                System.out.println("sayi:" + i);
            }
        }
    }

}
