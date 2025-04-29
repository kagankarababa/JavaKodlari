package metot;

import java.util.Scanner;

public class ornek9 {

    /*public static void main(String[] args) {

        Scanner giris=new Scanner(System.in);
        
        for(int i=1;i<=10;i++){
            System.out.println(i+". sayiyi giriniz:");
            int sayi=giris.nextInt();
        }
        
    }

    public static void enBuyuk() {

        int sayi1,sayi2;
        
        
    }*/

    public static void main(String[] args) {

        int sonuc;
        sonuc=enBuyuk();
        System.out.println(sonuc);


        System.out.println("en buyuk sayiniz:"+enBuyuk());
        

    }

    public static int enBuyuk() {
        Scanner giris=new Scanner(System.in);

        int sayi,enbuyuk=0;

        for(int i=1;i<=3;i++){

            System.out.println(i+".sayiyi giriniz:");
            sayi=giris.nextInt();

            if(sayi>enbuyuk){
                enbuyuk=sayi;
            }
        }

        return enbuyuk;
        
    }

}
