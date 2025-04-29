import java.util.Scanner;

public class soru1 {

    //Klavyeden girilen bir sayının pozitif, 
    //negatif veya sıfıra eşit olduğunu ekrana yazdıran program?

    public static void main(String[] args) {

        int sayi;

        Scanner giris = new Scanner(System.in);

        System.out.println("Lutfen bir sayi giriniz:");
        sayi = giris.nextInt();

        if (sayi == 0)
            System.out.println("Girilen sayi sifira esittir.");

        else if (sayi > 0)
            System.out.println("Girilen sayi pozitiftir.");

        else if (sayi < 0)
            System.out.println("Girilen sayi negatiftir.");

    }
}
// kod düzenleme kısayolu shift option f
// cmd+s kod kaydetme


/* 
1-)PUBLİC NEDİR?
-public, Java'da erişim belirleyici (access modifier) olarak kullanılır.

-Bir sınıfın veya metodun public olarak tanımlanması, o sınıfın veya metodun her yerden erişilebilir olduğunu belirtir.

-Yani, o sınıf veya metot başka bir sınıf tarafından başka bir paketten bile erişilebilir.
Eğer public yerine başka bir erişim belirleyici kullanırsanız 
(örneğin, private, protected veya erişim belirleyici belirtilmezse "default" erişim), 
o sınıf veya metot sadece belirli erişim koşulları altında kullanılabilir.

!!KISACASI=public erişim belirleyicisi, sınıfın veya metodun dışarıdan erişilebilir olmasını sağlar.




2-)CLASS NEDİR?
-class, Java'da bir sınıf tanımlamak için kullanılır.

-Bir sınıf, Java'daki tüm nesneleri ve davranışları tanımlar. 
Java'da her şey bir sınıf (class) etrafında organize edilir.

-Sınıflar, özellikler (fields) ve davranışlar (methods) içerir. 
Bu sayede nesne tabanlı programlamayı (OOP) mümkün kılar.

!!KISACASI=class, bir sınıf tanımlamanın anahtar kelimesidir ve tüm Java nesne tabanlı yapılarının temelidir.




3EK BİLGİ)public static void main(String[] args)
-main metodu ise, Java programlarının çalışmaya başladığı yerdir.
 public static void main(String[] args) metodu, uygulamanın başladığı 
 noktadır ve tüm Java programlarında gereklidir.




 4-)STATİC NEDİR?
 -static anahtar kelimesi, bir sınıfın üye metodunun (ya da değişkeninin) 
 sınıf düzeyinde olduğunu belirtir. 
 Yani, bu metot sınıfın bir örneği (instance) oluşturulmadan doğrudan sınıf üzerinden erişilebilir.

 -static kullanıldığında, o metot ya da değişken,
belirli bir nesneye bağlı değil, sınıfın kendisine bağlıdır

  -Java'daki main metodu da static olarak tanımlandığı için,
 Java çalışma zamanı program başladığında sınıfın bir örneğini yaratmadan doğrudan erişebilir.
  



5-)VOİD NEDİR?
-void, bir metodun geri dönüş tipi (return type) olarak kullanılır.

-Eğer bir metodun geri dönmesi gereken bir değeri yoksa,
 yani metod çalıştığında bir değer dönmeyecekse, bu metot void olarak tanımlanır.




 6-)MAİN NEDİR?
 -main, Java programında uygulamanın çalışmaya başladığı ilk metodu ifade eder. 
 Bu metod, Java uygulamaları için ana başlangıç noktasıdır.

 -Java uygulamasını başlatan JVM (Java Virtual Machine),
  programı çalıştırırken main metodunu çağırır.



  
  7-)STRİNG[] ARGS NEDİR ?
  -String[] args, main metodunun parametresidir
  ve komut satırı argümanlarını alır.

  -Bu, kullanıcıdan veya başka bir kaynaktan gelen verilerin
   (parametrelerin) programa aktarılmasını sağlar.

   -args bir dizi (array) olduğu için, birden fazla 
   komut satırı argümanı kabul edebilir.


*/
