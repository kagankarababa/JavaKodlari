import java.util.Scanner;

public class soru3 {

    //Klavyeden girilen pozitif bir sayının tek mi, çift mi olduğunu bulan program

    public static void main(String[] args) {

        int sayi;

        Scanner giris = new Scanner(System.in);

        System.out.println("Lutfen pozitif bir sayi giriniz:");
        sayi = giris.nextInt();

         if (sayi<0)
            System.out.println("Hatali tuslama yaptiniz.Pozitif sayi giriniz.");

        else if (sayi % 2 == 1)
            System.out.println("Girilen sayi tektir.");

        else if(sayi %2 == 0)
            System.out.println("Girilen sayi cifttir");

        /*
         * CHAR İLE İLGİLİ BİLGİLENDRİME!!!!
         * char c = 2000;
         * char t='k';
         * char v='\u0152' -- sysout(v)= özel karaketeri verir.
         * 
         * System.out.println(c);
         * System.out.println(t);
         */

    }

}
