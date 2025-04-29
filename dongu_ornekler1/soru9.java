package dongu_ornekler1;

import java.util.Scanner;

public class soru9 {
    public static void main(String[] args) {
        Scanner giris = new Scanner(System.in);
        int carpan, adım, sonuc = 0;

        System.out.println("Lutfen carpani giriniz:");
        carpan = giris.nextInt();

        System.out.println("Lutfen kac kere carpim olacagını giriniz:");
        adım = giris.nextInt();

        System.out.println("Carpan:" + carpan);
        System.out.println("Adim:" + adım);

        for (int i = 1; i <= adım; i++) {
            sonuc = carpan * i;
            System.out.println(i + "x" + carpan + "=" + sonuc);
        }

    }

}
