package kosul_ornekler2;

import java.util.Scanner;

public class soru6 {
    public static void main(String[] args) {

        Scanner giris = new Scanner(System.in);

        int mat, fiz, kim, toplam = 0, matfiz = 0;

        System.out.println("Lutfen matematik notunuzu giriniz:");
        mat = giris.nextInt();

        System.out.println("Lutfen fizik notunuzu giriniz:");
        fiz = giris.nextInt();

        System.out.println("Lutfen kimya notunuzu giriniz:");
        kim = giris.nextInt();

        toplam = mat + fiz + kim;
        matfiz = mat + fiz;

        if (mat >= 65 && fiz >= 55 && kim >= 50) {
            if (toplam >= 190 || matfiz >= 140) {
                System.out.println("TEBRİKLER KURSA KABUL EDİLDİNİZ İSTE BUUU ;))))");
            } else {
                System.out.println("UZGUNUZ KURSA KABUL EDİLMEDİNİZ TEKRAR DENEYİN :))))");
            }
        } else {
            System.out.println("UZGUNUZ KURSA KABUL EDİLMEDİNİZ TEKRAR DENEYİN :))))");

        }
    }

}
