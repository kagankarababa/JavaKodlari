package diziler;

import java.util.Scanner;

public class soru7 {
    public static void main(String[] args) {

        int sayilar[][] = { { 99, 37, 15, 51, 20, 78, 99, 33, 92, 41 },
                { 98, 93, 41, 19, 27, 93, 63, 36, 63, 28 },
                { 23, 20, 50, 56, 28, 79, 81, 39, 33, 49 },
                { 33, 36, 58, 92, 47, 32, 74, 32, 23, 26 },
                { 92, 88, 78, 68, 65, 81, 26, 89, 23, 54 },
                { 94, 61, 41, 84, 40, 79, 79, 84, 49, 21 },
                { 80, 76, 83, 54, 55, 57, 75, 44, 11, 26 },
                { 10, 35, 77, 57, 14, 79, 37, 39, 88, 23 },
                { 84, 32, 34, 81, 81, 53, 71, 39, 62, 39 },
                { 89, 45, 20, 93, 18, 90, 98, 32, 16, 17 } };

        int toplam = 0;

        for (int i = 0; i < 10; i++) {
            toplam = 0;

            for (int j = 0; j < 10; j++) {
                toplam += sayilar[i][j];
            }

            System.out.println((i+1)+".Satir toplami: "+toplam);

        }
        
        toplam = 0;

        System.out.println("**************************");

        for (int i = 0; i < 10; i++) {
            toplam = 0;

            for (int j = 0; j < 10; j++) {
                toplam += sayilar[j][i];
            }

            System.out.println((i + 1) +".Sutun toplamı: " + toplam);

        }

        Scanner giris=new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz:");
        int sayi=giris.nextInt();

        for(int i=0;i<10;i++){
            for(int j=0;j<10;j++){
                if(sayilar[i][j]>sayi){
                    sayilar[i][j]=0;
                }
            }
        }

        System.out.println("güncellenmis dizi:");

        for(int i=0;i<10;i++){
            for(int j=0;j<10;j++){
                System.out.print(sayilar[i][j]+" ");
            }
            System.out.println();
        }

    }

}
