package metot;

public class ornek7 {

    // Kendisine yollanan 2 sayı arasındaki
    // asal sayıları listeleyen ve ekrana
    // yazdıran bir metot yazınız.

    public static void main(String[] args) {

        asalSayi(1, 10);

    }

    public static void asalSayi(int sayi1,int sayi2) {

        boolean asalMi=true;

        for(int i=sayi1;i<=sayi2;i++){

            for(int j=2;j<i;j++){
                if(i%j==0){
                    asalMi=false;
                    break;
                }
            }
            if(asalMi==true){
                System.out.println(i);
            }
            asalMi=true;

        }
        
    }

}
