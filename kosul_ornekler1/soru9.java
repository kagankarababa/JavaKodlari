import java.util.Scanner;

public class soru9 {
    /*
     * Bir eğitim kurumunda görev yapan öğretmenlere normal maaşlarına ek olarak,
     * girdikleri ders
     * saatine göre ek ders ücreti ödenmektedir. Ödenecek ek ders ücreti aşağıdaki
     * şartlara göre
     * verilmektedir.
     * a. Ders saati 10 saatten az ise ders saati başına 10 TL,
     * b. Ders saati 10 ile 20 saat arasında ise ders saati başına 12,5TL,
     * c. Ders saati 20 saatten fazla ise ders saati başına 13 TL,
     * Buna göre öğretmenin girilen ek ders saatine göre alacağı ücreti bulan
     * program,
     */
    public static void main(String[] args) {

        double ekucret=0,saat;

        Scanner giris=new Scanner(System.in);
        System.out.println("Ek olarak girdiginiz saati yazın:");
        saat=giris.nextDouble();

        if(saat<10){
            ekucret=saat*10;
        }
        else if(saat>=10 && saat<20 ){
            ekucret=saat*12.5;
        }
        else if(saat>=20){
            ekucret=saat*13;
        }

        System.out.println("Ek ucretiniz = "+ekucret);
        

    }

}
