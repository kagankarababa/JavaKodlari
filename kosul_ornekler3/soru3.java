package kosul_ornekler3;

import java.util.Scanner;

public class soru3 {
    public static void main(String[] args) {
        
    Scanner giris=new Scanner(System.in);

    int ks,vize,fınal;
    double bp=0,ksort=0,vizeort=0;

    for(int i=1;i<=3;i++){
        System.out.println(i+".Kisa sinav notunuzu giriniz:");
        ks=giris.nextInt();
        ksort=ksort+ks;
    }
    for(int i=1;i<=2;i++){
        System.out.println(i+".Vize sinav notunuzu giriniz:");
        vize=giris.nextInt();
        vizeort+=vize;
    }
    System.out.println("Final notunuzu giriniz:");
    fınal=giris.nextInt();
    ksort=ksort/3;
    vizeort=vizeort/3;

    bp=(ksort*50/100+vizeort*50/100)*40/100+fınal*60/100;
    System.out.println("Basari puaniniz="+bp);
    

}
}
