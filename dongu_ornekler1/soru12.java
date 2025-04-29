package dongu_ornekler1;

import java.util.Scanner;

public class soru12 {
    public static void main(String[] args) {
        
          double nüfus = 77, artıs = 0;
          
          for (int i = 1; i <= 10; i++) {
          
          artıs = nüfus * 1.3 / 100;
          nüfus += artıs;
          
          System.out.println((i + 2015) + ".yılda nüfus:" + nüfus);
          
          }
         

        /*Scanner giris = new Scanner(System.in);
        int yil;
        double nufus, artis;

        System.out.println("bulundugunuz yili giriniz:");
        yil = giris.nextInt();

        System.out.println("nufusunuzu girin:");
        nufus = giris.nextDouble();

        System.out.println("nufusunuzun %kaç arttigini giriniz:");
        artis = giris.nextDouble();

        yil += 1;
        artis += 100;

        for (int i = 1; i <= 10; i++) {

            nufus = nufus * artis / 100;

            System.out.println(yil + ".yılda nüfus:" + nufus);
            yil++;

        }*/

    }
}
