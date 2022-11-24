package day09_StringManipulation;

public class C07_ilkTest {
    public static void main(String[] args) {
        // Gittigimiz web sayfasindan aldigimiz
// String arama sonuclarinda
// arama sayisinin 50'den fazla oldugunu test edin

        String input = "1-48 of 871 results for \"nutella\"";

        int of = input.indexOf("of") +3;
        int result = input.indexOf("result") - 1;
        String rakam = input.substring(of, result);
        Integer i = Integer.valueOf(rakam );//boyle de stringi int e ceviririz
        int i1 = Integer.parseInt(rakam);//boyle de stringi int e ceviririz
       if(i>50||i1>50){
           System.out.println("Nutella arama testi PASSED");
       }else{
           System.out.println("istenen kadar sonuc yok, Nutella arama testi FAILED");
       }

    }
}
