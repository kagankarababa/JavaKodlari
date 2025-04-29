import java.util.Scanner;

public class soru5 {
     //Klavyeden girilen a ve b sayılarından a nin b yı 
    //tam bölünüp bölünmediğini bulan ve sonucu ekrana yazdıran program?

    public static void main(String[] args) {

        int sayi1,sayi2,sonuc=0;

        Scanner giris=new Scanner(System.in);
        
        System.out.println("Birinci sayiyi giriniz:");
        sayi1=giris.nextInt();

        System.out.println("İkinci sayiyi giriniz:");
        sayi2=giris.nextInt();

        if(sayi1%sayi2==0){
        System.out.println("Girilen iki sayi birbirine tam bolunmektedir.");
        sonuc=sayi1/sayi2;
        System.out.println(sonuc);
        }
        else
        System.out.println("Girilen iki sayi birbirine tam bolunmemektedir.");
       
    }

}
