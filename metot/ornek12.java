package metot;

public class ornek12 {

    // Metoda kaç tane sayı yollarsak
    // yollayalım bütün sayıları toplamı
    // bulup ekrana yazdırsın.

    public static void main(String[] args) {

        topla(1,3,4,5);

    }

    public static void topla(int ...sayilar) {

        int toplam=0;

        for(int i=0;i<sayilar.length;i++){
            toplam+=sayilar[i];
        }
        System.out.println("Sayilarin toplami:"+toplam);
        
    }

}
