import java.util.Scanner;

public class soru11 {
    /*
     * İki sayı arasında dört işlemden(toplama, çıkarma, çarpma, bölme) birini yapan
     * programın
     * çalışması şu şekilde olmalıdır; ilk önce iki sayının veri girişi yapılacak
     * daha sonra ise kullanıcı
     * hangi matematiksel işlemi yapmak istiyorsa o işlemin operatörünü klavyeden
     * girecek ve iki
     * sayı kullanıcının girdiği matematik operatörüne göre hesaplamasını yapıp
     * sonucu ekrana
     * yazdıracaktır. Bu işlemi yapan programın algoritmasını yazınız.( toplama için
     * +, çıkarma için -,
     * çarpma için *, bölme için / veri girişi olduğunu varsayınız.)
     */
    public static void main(String[] args) {

        double sayi1, sayi2;
        double sonuc = 0;
        char op;

        Scanner giris = new Scanner(System.in);

        System.out.println("Birinci sayiyi giriniz:");
        sayi1 = giris.nextDouble();

        System.out.println("Hangi islemi yapmak istiyorsunuz?(+,-,*,/)");
        op = giris.next().charAt(0);

        System.out.println("Ikinci sayiyi giriniz:");
        sayi2 = giris.nextDouble();

        if (op == '+')
            sonuc = sayi1 + sayi2;

        else if (op == '-')
            sonuc = sayi1 - sayi2;

        else if (op == '/')
            sonuc = sayi1 / sayi2;

        else if (op == '*')
            sonuc = sayi1 * sayi2;

        System.out.println("Isleminizin sonucu=" + sonuc);

    }

}
