package dongu_ornekler1;

import java.util.Scanner;

public class soru4 {
    public static void main(String[] args) {
        Scanner giris = new Scanner(System.in);
        int ssayi;

        System.out.println("Son sayiyi giriniz:");
        ssayi = giris.nextInt();

        for (int i = 1; i <= ssayi; i++) {
            if (i % 5 == 0) {
                System.out.println(i);
            }
        }
    }

}
