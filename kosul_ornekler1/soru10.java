import java.util.Scanner;

public class soru10 {
    public static void main(String[] args) {
        double a, b, c, kok1, kok2, delta = 0, kokdelta;

        Scanner giris = new Scanner(System.in);

        System.out.println("Denklemin a degerini giriniz:");
        a = giris.nextDouble();

        System.out.println("Denklemin b degerini giriniz:");
        b = giris.nextDouble();

        System.out.println("Denklemin c degerini giriniz:");
        c = giris.nextDouble();

        delta = (b * b) - (4 * a * c);
        kokdelta = Math.sqrt(delta);

        if (delta < 0) {
            System.out.println("Denkleminizin reel koku yoktur.");
        }

        else if (delta == 0) {
            kok1 = -b / 2 * a;
            System.out.println("Denkleminizin koku= " + kok1);
        } else if (delta > 0) {
            kok1 = (-b + kokdelta) / (2 * a);
            kok2 = (-b - kokdelta) / (2 * a);

            System.out.println("Denkleminizin birinci koku= " + kok1 + " Denkleminizin ikinci koku= " + kok2);
        }

    }

}
