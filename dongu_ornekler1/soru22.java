package dongu_ornekler1;

import java.util.Scanner;

public class soru22 {
    public static void main(String[] args) {
        Scanner giris = new Scanner(System.in);
        String ay;
        double sicaklik, ort, toplam = 0;

        System.out.println("Lutfen ayi secin:");
        ay = giris.nextLine();

        if (ay.equals("subat")) {

            for (int i = 1; i <= 3; i++) {
                System.out.println(i + ".gun sicaklik degerini giriniz:");
                sicaklik = giris.nextDouble();
                toplam += sicaklik;
            }
            ort = toplam / 3;

            System.out.println("Subat ayina ait ortalama sicaklik:" + ort);
        }

        if ((ay.equals("ocak") || ay.equals("mart") || ay.equals("nisan") || ay.equals("mayis")
                || ay.equals("haziran") || ay.equals("temmuz") || ay.equals("ağustos")) || ay.equals("eylül")
                || ay.equals("ekim") || ay.equals("kasım") || ay.equals("aralık")) {

            for (int i = 1; i <= 5; i++) {
                System.out.println(i + ".gun sicaklik degerini giriniz:");
                sicaklik = giris.nextDouble();
                toplam += sicaklik;
            }
            ort = toplam / 5;
            System.out.println(ay + " ayina ait ortalama sicaklik:" + ort);

        }

    }
}
