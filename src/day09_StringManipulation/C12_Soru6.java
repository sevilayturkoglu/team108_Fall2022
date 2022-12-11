package day09_StringManipulation;

public class C12_Soru6 {
    public static void main(String[] args) {
        /* Kullanicidan alinan bir String alin, String’in uzunlugu cift sayi ise tam ortasina
        :) ekleyin, String’in uzunlugu tek sayi ise ortadaki harfi silin ve yerine :(
                yazdirin*/
        String str = "Phytoon";
        if (str.length() % 2 == 0) {
            System.out.println(str.substring(0, str.length() / 2) + ":)" + str.substring(str.length() / 2));
            //replace ile cozum
            System.out.println(str.replace(str.substring(str.length() / 2), ":)" + str.substring(str.length() / 2)));
        } else {
            System.out.println(str.substring(0, str.length() / 2) + ":(" + str.substring(str.length() / 2 + 1));
            //replace ile cozum
            System.out.println(str.replace(str.substring(str.length() / 2), ":(")
                    + str.substring(str.length() / 2 + 1));
        }
    }
}
