import java.util.Scanner;

public class soru2 {

    //Klavyeden girilen birbirine eşit olmadığı düşünülen
    // iki sayıdan büyüğünü ekrana yazdıran program?

    public static void main(String[] args) {
        int sayi1, sayi2;

        Scanner giris = new Scanner(System.in);

        System.out.print("birinci sayiyi giriniz:");
        sayi1 = giris.nextInt();

        System.out.print("ikinci sayiyi giriniz:");
        sayi2 = giris.nextInt();

        if (sayi1 > sayi2)
            System.out.println("birinci sayiniz daha buyuktur = " + sayi1);

        else if (sayi2 > sayi1)
            System.out.println("ikinci sayiniz daha buyuktur = " + sayi2);

    }

}
