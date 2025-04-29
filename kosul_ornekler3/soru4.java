package kosul_ornekler3;

import java.util.Scanner;

public class soru4 {
    public static void main(String[] args) {

        Scanner giris = new Scanner(System.in);

        String fakulte, ders;
        int ucret = 0;

        System.out.println("Fakukte secimi yapiniz(MF,TF,EF):");
        fakulte = giris.nextLine();
        System.out.println("Ders secimi yapiniz(FIZ1,FIZ2,KLK1,KLK2):");
        ders = giris.nextLine();

        if (fakulte.equals("MF")) {
            if (ders.equals("FIZ1")) {
                ucret = 3 * 22;
            }
            if (ders.equals("FIZ2")) {
                ucret = 3 * 22;
            }
            if (ders.equals("KLK1")) {
                ucret = 4 * 22;
            }
            if (ders.equals("KLK2")) {
                ucret = 4 * 22;
            }

        } else if (fakulte.equals("TF")) {
            if (ders.equals("FIZ1")) {
                ucret = 3 * 20;
            }
            if (ders.equals("FIZ2")) {
                ucret = 3 * 20;
            }
            if (ders.equals("KLK1")) {
                ucret = 4 * 20;
            }
            if (ders.equals("KLK2")) {
                ucret = 4 * 20;
            }

        } else if (fakulte.equals("EF")) {
            if (ders.equals("FIZ1")) {
                ucret = 3 * 19;
            }
            if (ders.equals("FIZ2")) {
                ucret = 3 * 19;
            }
            if (ders.equals("KLK1")) {
                ucret = 4 * 19;
            }
            if (ders.equals("KLK2")) {
                ucret = 4 * 19;
            }

        }
        System.out.println("Odemeniz gereken ucret= " + ucret);

    }

}
