package diziler;

import java.util.Scanner;

public class soru9 {
    public static void main(String[] args) {
        Scanner giris = new Scanner(System.in);
        int[][] notlar = new int[10][2];
        int ort = 0;

        for (int i = 0; i < 10; i++) {
            System.out.println((i + 1) + ".ogrencinin vize ve final notunu sirasiyla giriniz:");
            for (int j = 0; j < 2; j++) {

                notlar[i][j] = giris.nextInt();
            }
        }

        for (int i = 0; i < 10; i++) {
            ort = 0;

            ort = notlar[i][0] * 4 / 10 + notlar[i][1] * 6 / 10;

            System.out.println((i + 1) + ".ogrencinin ort:" + ort);

            if (ort < 70) {
                System.out.println("kaldiniz");
            } else {
                System.out.println("gectiniz");
            }

        }

        for (int i = 0; i < 10; i++) {
            if (notlar[i][0] < 50) {
                System.out.println((i + 1) + ".ogrencinin vize notu 50den kucuk ve final notu:" + notlar[i][1]);
            }
        }

        for (int i = 0; i < 10; i++) {

            if (60 < notlar[i][0] && 70 > notlar[i][0] && notlar[i][1] > 70) {
                System.out.println("final notunuz:" + notlar[i][1]);
            }

        }

    }

}
