package metot;

import java.util.Random;

public class ornek4 {

    // Çalıştığında 0-100 arasında bir
    // tam sayı tutup geriye tuttuğu bu tam
    // sayıyı döndüren metodu yazınız.
    // PARAMETRESİZ RETURNLÜ !!!!!!!

    public static void main(String[] args) {

       /*  int sonuc;

        sonuc = rastgeleSayi();

        System.out.println(sonuc);*/

        System.out.println(rastgeleSayi());


    }

    public static int rastgeleSayi() {

        Random rnd = new Random();
        int sayi;
        sayi = rnd.nextInt(101);

        return sayi;

    }

}
