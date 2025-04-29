package dongu_ornekler2;

public class soru3 {
    public static void main(String[] args) {

        double sayi1 = 1, sayi2 = 1;

        System.out.println(sayi1);
        System.out.println(sayi2);

        for (int i = 1; i <= 100; i++) {
            if (i % 2 == 1) {

                sayi1 = sayi1 + sayi2;
                System.out.println(sayi1);

            } else if (i % 2 == 0) {
                sayi2 = sayi1 + sayi2;
                System.out.println(sayi2);
            }
        }

    }

}
