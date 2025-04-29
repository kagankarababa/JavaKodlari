import java.util.Scanner;

public class soru4 {

    // Klavyeden girilen pozitif sayının 7’ e tam bölünüp bölünmediğini
    // bulan ve sonucu ekrana yazdıran program?

    public static void main(String[] args) {
        Scanner giris = new Scanner(System.in);
        double kalan = 0, sayi, sonuc = 0;

        
        System.out.println("Lutfen pozitif bir sayi giriniz:");
        sayi = giris.nextDouble();

        sonuc = sayi / 7;
        System.out.println("Isleminizin sonucu = " + sonuc);
        System.out.println("**************************");

        if (sayi % 7 == 0)
            System.out.println("Girilen sayi 7'ye tam bolunmektedir.");

        else if (sayi % 7 != 0) {
            kalan = sayi % 7;
            System.out.println("Girilen sayi 7 ye tam bolunmemektedir.");
            System.out.println("Kalan sayiniz = " + kalan);

        }

    }

}
