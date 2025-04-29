package kosul_ornekler3;

import java.util.Scanner;

public class soru1 {
    public static void main(String[] args) {
        Scanner giris = new Scanner(System.in);
        double sayi1, sayi2, sonuc = 0;
        char islem;

        System.out.println("Birinci sayiyi giriniz:");
        sayi1 = giris.nextDouble();

        System.out.println("Islem turunu giriniz:");
        islem = giris.next().charAt(0);

        System.out.println("Ikinci sayiyi giriniz:");
        sayi2 = giris.nextDouble();

        switch (islem) {
            case '+':
                sonuc = sayi1 + sayi2;
                break;

            case '-':
                sonuc = sayi1 - sayi2;
                break;

            case '*':
                sonuc = sayi1 * sayi2;
                break;

            case '/':
                sonuc = sayi1 / sayi2;
                break;

            default:
            System.out.println("yanlis karakter girdiniz");
                break;
        }
        System.out.println("Hesaplama sonucu= " + sonuc);

    }

}
