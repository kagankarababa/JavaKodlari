package metot;

public class ornek8 {

    public static void main(String[] args) {

        /*double sonuc;
        sonuc = hesaplama(1, 2, '/');
        System.out.println(sonuc);*/

        System.out.println(hesaplama(10, 20, '+'));

    }

    public static double hesaplama(double sayi1, double sayi2, char op) {

        double islem = 0;

        if (op == '+') {
            islem = sayi1 + sayi2;
        }

        else if (op == '-') {
            islem = sayi1 - sayi2;
        }

        else if (op == '*') {
            islem = sayi1 * sayi2;
        }

        else if (op == '/') {
            islem = sayi1 / sayi2;
        }

        return islem;

    }

}
