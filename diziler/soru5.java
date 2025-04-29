package diziler;

public class soru5 {
    public static void main(String[] args) {
        
        int adet=0;

        for(int i=1;i<=10;i++){
            if(i%5==0 && i%3!=0){
                adet++;
            }
        }

        int dizi[]=new int[adet];
        
        int toplam=0;

        for(int i=0;i<=10;i++){
            if(i%5==0&& i%3!=0){
                dizi[adet]=i;
                adet++;
                toplam+=i;
            }

        }
        System.out.println("sayilarin toplami:"+toplam);
        System.out.println("sayilarin adeti:"+adet);
        System.out.println("5 e tam bölünüp 3 e bölünmeyen sayilar:");
        
        for(int i:dizi){
            System.out.println(i);
        }
    }

}
