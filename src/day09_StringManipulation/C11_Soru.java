package day09_StringManipulation;

public class C11_Soru {
    public static void main(String[] args) {
       /* Kullanicidan bir sifre isteyip, asagidaki sartlari kontrol edin ve kullaniciya
        duzeltmesi gereken tum eksikleri soyleyin, eger tum sartlari saglarsa, "sifre
        basariyla kaydedildi" yazdirin
                - ilk harf kucuk harf olmali
        - son karakter rakam olmali
                - "sifre bosluk icermemeli
        - uzunlugu en az 10 karakter olmal*/

        String sifre="akljhffllbhjjlkk5";

        if(sifre.length()<10){
            System.out.println("Sifre uzunlugu en az 10 karakter olmali");
        }if(sifre.contains(" ")){
            System.out.println("sifre bosluk icermemeli");
        }if(!(sifre.charAt(sifre.length()-1)>='0'&&sifre.charAt(sifre.length()-1)<='9')){
            System.out.println("son karakter rakam olmali");
        }if(!(sifre.charAt(0)>='a'&&sifre.charAt(0)<='z')){
            System.out.println("ilk harf kucuk harf olmali");
        }else{
            System.out.println("sifre basariyla kaydedildi");
        }


    }
}
