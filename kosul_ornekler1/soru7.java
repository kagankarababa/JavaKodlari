import java.util.Scanner;

public class soru7 {
    public static void main(String[] args) {
        int not;

        Scanner giris = new Scanner(System.in);

        System.out.println("Not giriniz:(0-100 arası)");
        not = giris.nextInt();

        if (0 <= not && not < 25)
            System.out.println("F");

        else if (25 <= not && not < 45)
            System.out.println("E");

        else if (45 <= not && not < 55)
            System.out.println("D");

        else if (55 <= not && not < 70)
            System.out.println("C");

        else if (70 <= not && not < 85)
            System.out.println("B");

        else if (85 <= not && not <= 100)
            System.out.println("A");
    }
}
