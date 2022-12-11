package day11_forLoop.BenimSoruCozumu;

public class Soru9_Ters {
    public static void main(String[] args) {
        /*
        Soru 9 (interview)- Kullanicidan bir String isteyin ve String’i tersten yazdirin
         */
        String input="Reyhan";
        String sret="";
        for (int i = input.length()-1; i >=0; i--) {
            sret+=input.charAt(i);
            sret+=input.substring(i,i+1);
        }
        System.out.println(sret.substring(0, 1).toUpperCase() + sret.substring(1).toLowerCase());
        System.out.println("ters = " + sret);
    }
}
