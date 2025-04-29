package kosul_ornekler2;

import java.util.Scanner;

public class soru5 {
    public static void main(String[] args) {

        Scanner giris = new Scanner(System.in);
        int x, y;

        System.out.println("x degerini giriniz:");
        x = giris.nextInt();

        System.out.println("y degerini giriniz:");
        y = giris.nextInt();

        if (x > 0 && y > 0)
            System.out.println("Girdiniz koordinat 1. bolgededir.");

        else if (x < 0 && y > 0)
            System.out.println("Girdiniz koordinat 2. bolgededir.");

        else if (x < 0 && y < 0)
            System.out.println("Girdiniz koordinat 3. bolgededir.");

        else if (x > 0 && y < 0)
            System.out.println("Girdiniz koordinat 4. bolgededir.");

    }

}
