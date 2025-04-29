package metot;

public class ornek10 {

    public static void main(String[] args) {

        int[] sayilar = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        int[] teksayilar = diziKopyala(sayilar);

        System.out.println("dizideki tek sayilar:");
        for (int sayi : teksayilar) {
            System.out.println(sayi);
        }

    }

    public static int[] diziKopyala(int[] gelenDizi) {

        int tadet = 0;

        for (int i = 0; i < gelenDizi.length; i++) {
            if (gelenDizi[i] % 2 != 0) {

                tadet++;
            }
        }

        int[] tekSayilar = new int[tadet];
        int j = 0;

        for (int i = 0; i < gelenDizi.length; i++) {
            if (gelenDizi[i] % 2 != 0) {
                tekSayilar[j++] = gelenDizi[i];
            }
        }

        return tekSayilar;
    }

}
