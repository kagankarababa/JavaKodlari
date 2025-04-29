package kosul_ornekler2;

import java.util.Scanner;

public class soru7 {
    public static void main(String[] args) {
        Scanner giris = new Scanner(System.in);

        char kategori;
        double fiyat, kdv = 0;

        System.out.println("Lutfen aldiginiz urunun kategorisini tuslayin(m,y,d):");
        kategori = giris.next().charAt(0);

        System.out.println("Lutfen aldiginizin urunun fiyatini yaziniz:");
        fiyat = giris.nextInt();

        if (kategori == 'm')
            kdv = fiyat * 1 / 100;

        else if (kategori == 'y')
            kdv = fiyat * 1 / 10;

        else if (kategori == 'd')
            kdv = fiyat * 1 / 5;

        System.out.println("Aldiginizin urunun kdv tutari= " + kdv);

    }

}
