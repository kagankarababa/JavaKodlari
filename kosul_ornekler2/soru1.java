package kosul_ornekler2;

import java.util.Scanner;

public class soru1 {
    public static void main(String[] args) {
        Scanner kagan = new Scanner(System.in);
        int yil;

        System.out.println("lutfen bir yil giriniz:");
        yil = kagan.nextInt();

        if (yil % 4 == 0) {
            
            if (yil % 100 == 0) {
                if (yil % 400 == 0) {
                    System.out.println("yil artik yildir ");
                } else {
                    System.out.println("yil artik yil degildir");
                }

            } else {
                System.out.println("yil artik yildir");
            }
        } else {
            System.out.println("yil artik yil degildir.");
        }

    }
}
