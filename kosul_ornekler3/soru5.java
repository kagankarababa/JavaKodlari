package kosul_ornekler3;

import java.util.Scanner;

public class soru5 {
    public static void main(String[] args) {
        Scanner giris = new Scanner(System.in);
        char mevsim;
        int orthiz, km;
        double yakit = 0;

        System.out.println("Lutfen mevsimi giriniz(Y,K):");
        mevsim = giris.next().charAt(0);

        System.out.println("Lutfen ortalama hizinizi giriniz:");
        orthiz = giris.nextInt();

        System.out.println("Lutfen gidilen mesafeyi giriniz(km):");
        km = giris.nextInt();

        if (mevsim == 'K') {
            if (orthiz >= 1 && orthiz <= 50) {
                yakit = km * 10.5 / 100;
            }
            if (orthiz >= 51 && orthiz <= 100) {
                yakit = km * 7.875 / 100;
            }
            if (orthiz >= 101 && orthiz <= 150) {
                yakit = km * 9.45 / 100;
            }
        }
        if (mevsim == 'Y') {
            if (orthiz >= 1 && orthiz <= 50) {
                yakit = km * 10 / 100;
            }
            if (orthiz >= 51 && orthiz <= 100) {
                yakit = km * 7.5 / 100;
            }
            if (orthiz >= 101 && orthiz <= 150) {
                yakit = km * 9 / 100;
            }
        }
        System.out.println("Yaktiginiz yakit miktari " + yakit);

    }

}
