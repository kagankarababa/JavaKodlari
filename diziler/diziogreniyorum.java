package diziler;

public class diziogreniyorum {

    public static void main(String[] args) {

        int[] sayilar = new int[5];
        sayilar[0]=5;
        sayilar[1]=4;
        sayilar[2]=9;
        sayilar[3]=3;
        sayilar[4]=8;

        int sayi=10;
        sayilar[0]=sayi;

        sayilar[1]=sayi+10*2;
        System.out.println(sayilar[1]);
        sayi=sayilar[1];

        System.out.println(sayi);

    }

}
