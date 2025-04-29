package kosul_ornekler2;

import java.util.Scanner;

public class soru4 {
    public static void main(String[] args) {
        Scanner giris = new Scanner(System.in);
        char karakter;

        System.out.println("Lutfen bir karakter giriniz");
        karakter = giris.next().charAt(0);

        if (karakter >= '0' && karakter <= '9')
            System.out.println("Girdiginiz karakter sayisal bir karakterdir.");

        else
            System.out.println("Girdiginiz karakter sayisal bir karakter degildir.");
    }

}
