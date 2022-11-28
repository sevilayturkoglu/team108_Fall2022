package day09_StringManipulation;

    public class C013_soru5 {
    /*Soru 5 : Kullanicidan isim ve soyismini ayri ayri alin.
    - ismi daha uzun ise, isim ve soyismi ilk harf buyuk kalanlar kucuk seklinde
    yazdirin
   - soyisim daha uzun ise ismi ilk harf buyuk digerleri kucuk, soyismi buyuk
    harflerle yazdiri*/
    public static void main(String[] args) {
    String isim="sevilaylar";
    String soy="turkoglu";

    if(isim.length()>soy.length()){
    System.out.println(isim.substring(0, 1).toUpperCase() + isim.substring(1).toLowerCase()
            + "  " + soy.substring(0, 1).toUpperCase() + soy.substring(1).toLowerCase());
   }else{
    System.out.println(isim.substring(0, 1).toUpperCase() +
            isim.substring(1).toLowerCase() + soy.substring(0).toUpperCase());
}
    }
}