package metot;

public class ornek3 {

    // Çalıştığında kendisine yollanan iki adet tam
    // sayıyı toplayıp sonucunu geriye döndüren metodu
    // yazınız.
    // PARAMETRELİ RETURNLÜ !!!!!!!

    public static void main(String[] args) {

        int sonuc;
        sonuc = sayilariToplama(10, 20);
        // burada 10 ve 20 argüman
        System.out.println(sonuc);

    }

    public static int sayilariToplama(int sayi1, int sayi2) {
        // burada sayi1 ve sayi2 parametre
        int toplam;
        toplam = sayi1 + sayi2;

        return toplam;

    }

}
