package day11_forLoop.BenimSoruCozumu;

public class Soru7_RakamlarToplami {
    public static void main(String[] args) {
        /*
        Soru 7- Kullanicidan pozitif bir tamsayi alip, rakamlar toplamini yazdirin.
         */
        int input=1453;
        int birlerBasamagi=0;
        int rakamlarToplami=0;

        for (int i = 1; i <=4 ; i++) {
            birlerBasamagi=input%10;
            rakamlarToplami+=birlerBasamagi;
            input=input/10;

        }
        System.out.println("rakamlarToplami = " + rakamlarToplami);
    }
}
