package kosul_ornekler2;

import java.util.Scanner;

public class soru3 {
    public static void main(String[] args) {

        Scanner giris = new Scanner(System.in);

        char karakter;

        System.out.println("Lutfen bir karakter giriniz:");
        karakter = giris.next().charAt(0);

        if ((karakter >= 'A' && karakter <= 'Z') || (karakter >= 'a' && karakter <= 'z'))
            System.out.println("Girdiginz karakter bir harftir.");

        else
            System.out.println("Girdiginiz karakter bir harf degildir.");

    }

}
/*Tabii, Character.isLetter() metodunu kullanmadan, sadece if koşullarıyla çözüm yapmak isterseniz, harflerin ASCII değerlerini kontrol ederek bunu yapabiliriz. İngilizce alfabesi büyük ve küçük harflerden oluşur, yani:

Büyük harfler: 'A' (65) ile 'Z' (90) arasındaki karakterler.
Küçük harfler: 'a' (97) ile 'z' (122) arasındaki karakterler.
Bu bilgiyi kullanarak, girilen karakterin ASCII değerine göre harf olup olmadığını kontrol edebiliriz. */
