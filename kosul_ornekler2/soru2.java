package kosul_ornekler2;

import java.util.Scanner;

public class soru2 {
    public static void main(String[] args) {

        Scanner giris = new Scanner(System.in);
        char harf;

        System.out.println("Lutfen bir harf giriniz:");
        harf = giris.next().charAt(0);

        if (harf == 'a' || harf == 'e' || harf == 'ı' || harf == 'i' || harf == 'o' || harf == 'ö' || harf == 'u'
                || harf == 'ü')

            System.out.println("girdiginiz harf unludur.");

        else
            System.out.println("girdiginiz harf unsuzdur.");

    }

}
