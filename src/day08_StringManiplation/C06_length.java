package day08_StringManiplation;

import java.util.Random;

public class C06_length {
    public static void main(String[] args) {
        String str = "Java her gecen gun daha da guzellesiyor, degil mi?";
        // sondan 3.karakteri yazdirin
        int length=str.length();
        System.out.println(length);//stringimizin uzunlgu 50
        System.out.println(str.charAt(str.length()-3));

        // Rastgele bir karakterini yazdiralim
        Random rn=new Random();
        System.out.println(str.charAt(rn.nextInt(str.length())));

    }
}