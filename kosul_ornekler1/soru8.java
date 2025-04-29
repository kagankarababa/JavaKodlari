import java.util.Scanner;

public class soru8 {
    /*
     * Klavyeden girilen iki direnç değerinden sonra yine klavyeden girilen bağlantı
     * tipine göre
     * eşdeğer direnç değerini bulan program(direnç değerlerinin ohm olarak
     * girildiğini varsayın,
     * seri bağlantı için klavyeden s, paralel bağlantı için klavyeden p değerinin
     * girildiği varsayılsın)
     */
    public static void main(String[] args) {

        int direnc1, direnc2, res = 0;
        char tip;

        Scanner giris = new Scanner(System.in);

        System.out.println("Birinci direnc degerini giriniz:");
        direnc1 = giris.nextInt();

        System.out.println("İkinci direnc degerini giriniz:");
        direnc2 = giris.nextInt();

        System.out.println("Baglantı tipini giriniz:(s/p)");
        tip = giris.next().charAt(0);

        if (tip == 's') 
            res = direnc1 + direnc2;
        

        else if (tip == 'p') 
            res = (direnc1 * direnc2) / (direnc1 + direnc2);
        

        System.out.println("RES = " + res);

    }

}
