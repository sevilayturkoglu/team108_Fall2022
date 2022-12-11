package day10_stringManipulation;

public class C06_soru_Sifre {
    public static void main(String[] args) {
        // Soru 4 : Kullanicidan bir sifre isteyip, asagidaki sartlari kontrol edin
        // ve kullaniciya duzeltmesi gereken tum eksikleri soyleyin,
        // eger tum sartlari saglarsa, "sifre basariyla kaydedildi" yazdirin
        // - ilk harf kucuk harf olmali
        // - son karakter rakam olmali
        // - sifre bosluk icermemeli
        // - uzunlugu en az 10 karakter olmali

        /*
           Bu soruda sartlari bagimsiz if cumlesi ile yapmak
           veya if-else ile yapmak mumkundur
           - Eger if-else ile yaparsak ilk hatada hatayi yazdirir
             geriye kalanlara bakmaz
             avantaji ise eger hata yoksa otomatik olarak basarili sekilde olusturuldu diyebilir
           - bagimsiz if cumlelerinde tum hatalari bir kerede soyleyebiliriz
             ancak bagimsiz if cumleleri kodun geriye kalani ile ilgilenmediginden
             basarili sifre olusturuldugunu bizim ayri bir mekanizma ile kontrol etmemiz gerekir
         */
        /*
            Sonucta basarili sifre olusturuldu demek icin bir kontrol mekanizmasi olusturmamiz gerekir
            Ya her adimda artiracagimiz bir sayac yapip en son 4 oldu ise basarili deriz
            veya basta verdigimiz deger olumsuz bir durum oldugunda artirilir,
            en sonda kontrol edip eger bastaki degeri hala koruyorsa basarili olmustur diyebiliriz
         */
        String sifre= "abcjhhvj145";
        //boolean flag=true;
        int count=0;
        // - ilk harf kucuk harf olmali
        if (!(sifre.charAt(0)>='a' && sifre.charAt(0)<='z')){
            // ilk harf kucuk degilse hatayi yazdir
            // sifre.charAt(0)<'a' || sifre.charAt(0)>'z'
            System.out.println("Ilk harf kucuk harf olmali");
            count++; // bir ceza puani aldi
        }
        // - son karakter rakam olmali
        if (!(sifre.charAt(sifre.length()-1)>='0' && sifre.charAt(sifre.length()-1)<='9')){
            // son karakter rakam degilse rapor yazdir
            System.out.println("Son karakter rakam olmali");
            count++;
        }
        // - sifre bosluk icermemeli
        if (sifre.contains(" ")){
            System.out.println("Sifre bosluk icermemeli");
            count++;
        }
        // - uzunlugu en az 10 karakter olmali
        if ((sifre.length()<10)){
            System.out.println("Sifrenin uzunlugu en az 10 karakter olmali");
            count++;
        }
        if (count==0){
            System.out.println("sifreniz basariyla kaydedildi");
        }



    }
    }

