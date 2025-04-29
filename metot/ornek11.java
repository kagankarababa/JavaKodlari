package metot;

public class ornek11 {

    // --Parametre sayısı veya
    // parametrelerinin veri tipi farklı
    // olarak aynı adlı metotlar
    // oluşturulabilir.
    // --Geriye dönüş veri tipi önemli degildir.
    public static void main(String[] args) {

        topla(23, 12);
        topla(3.5, 7.7);
        topla(1, 2, 3);

    }

    public static void topla(int sayi1, int sayi2) {

        System.out.println(sayi1 + sayi2);

    }

    public static void topla(double sayi1, double sayi2) {

        System.out.println(sayi1 + sayi2);

    }

    public static void topla(int sayi1, int sayi2, int sayi3) {

        System.out.println(sayi1 + sayi2 + sayi3);

    }

}
