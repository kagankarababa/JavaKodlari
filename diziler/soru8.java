package diziler;

import java.util.Random;
import java.util.Scanner;

public class soru8 {
    public static void main(String[] args) {

        Scanner giris = new Scanner(System.in);
        Random rnd = new Random();
        int toplam = 0, ort;
        int satir,sutun;

        System.out.println("lutfen dizinizin satir sayisini giriniz:");
        satir = giris.nextInt();

        System.out.println("lutfen dizinizin sutun sayisini giriniz:");
        sutun = giris.nextInt();

        int[][] dizi = new int[satir][sutun];

        for (int i = 0; i < satir; i++) {
            for (int j = 0; j < sutun; j++) {
                dizi[i][j] = rnd.nextInt(51) + 50;//(50-100)arası 50 ve 100 dahil
            }
        }
        for (int i = 0; i < satir; i++) {
            toplam = 0;
            ort = 0;
            for (int j = 0; j < sutun; j++) {
                toplam += dizi[i][j];
                ort = toplam / sutun;

            }
            System.out.println((i + 1) + ".satır ort:" + ort);
        }
        System.out.println("diziniz:");
        for (int i = 0; i < satir; i++) {
            for (int j = 0; j < sutun; j++) {

                System.out.print(dizi[i][j] + " ");
            }
            System.out.println();
        }

    }

}
