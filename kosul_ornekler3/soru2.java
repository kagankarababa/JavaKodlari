package kosul_ornekler3;

import java.util.Scanner;

public class soru2 {
    public static void main(String[] args) {

        Scanner giris=new Scanner(System.in);

        int boy,yas,kilo;
        char cinsiyet;
        double idealKilo=0;

        System.out.println("Lutfen yasinizi giriniz:");
        yas=giris.nextInt();

        System.out.println("Lutfen cinsiyetinizi giriniz(k/e):");
        cinsiyet=giris.next().charAt(0);

        System.out.println("Lutfen boyunuzu giriniz:");
        boy=giris.nextInt();

        System.out.println("Lutfen kilonuzu giriniz:");
        kilo=giris.nextInt();

        if(cinsiyet=='k'){
            idealKilo=(boy-100+yas/10)*0.8;
            if(idealKilo==kilo){
                System.out.println("Ideal kilodasınız tebrikler");
            }
            if(idealKilo>kilo){
                System.out.println("Ideal kilonuz= "+idealKilo);
                System.out.println(idealKilo-kilo+" kilo almalisiniz");
            }
            else if(kilo>idealKilo){
                System.out.println("Ideal kilonuz= "+idealKilo);
                System.out.println(kilo-idealKilo+" kilo vermelisiniz");
            }
            
        }

            else if(cinsiyet=='e'){
            idealKilo=(boy-100+yas/10)*0.9;
        
            if(idealKilo==kilo){
                System.out.println("Ideal kilodasınız tebrikler");
            }
            if(idealKilo>kilo){
                System.out.println("Ideal kilonuz= "+idealKilo);
                System.out.println(idealKilo-kilo+" kilo almalisiniz");
            }
            else if(kilo>idealKilo){
                System.out.println("Ideal kilonuz= "+idealKilo);
                System.out.println(kilo-idealKilo+" kilo vermelisiniz");
            }
            
        }
            }
        



    }


