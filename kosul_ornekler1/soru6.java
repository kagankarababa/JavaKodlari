import java.util.Scanner;

public class soru6 {

    // Bir öğrencinin klavyeden girilen vize sınav notunun %40 nı ve final sınav
    // notunun %60 nı
    // alarak ortalamasını hesaplayıp ekrana yazdıran ve ortalaması 70 ve üzerinde
    // ise ekrana
    // BAŞARILI değilse BAŞARISIZ yazan program
    public static void main(String[] args) {

        int fnot, vnot, ort = 0;
        Scanner giris = new Scanner(System.in);

        System.out.println("Vize notunu giriniz(0-100 arasi):");
        vnot = giris.nextInt();

        System.out.println("Final notunu giriniz(0-100 arasi)");
        fnot = giris.nextInt();

        ort = vnot * 40 / 100 + fnot * 60 / 100;

        if (ort >= 70)
            System.out.println("BAŞARILI");

        else
            System.out.println("BAŞARISIZ");

    }

}
