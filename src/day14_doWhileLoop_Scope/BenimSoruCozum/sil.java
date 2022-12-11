package day14_doWhileLoop_Scope.BenimSoruCozum;

public class sil {
    public static void main(String[] args) {


        String str = "Java Candir";
        int bas = str.length()-1;
        String ters="";
        while (bas>=0){
            ters+=str.charAt(bas);
            bas--;
        }
        System.out.println(ters);

        String str1="Java ogrenmek cok guzel";
        String tersStr="";
        int sayi=str1.length()-1;
        while(sayi>=0){
            char harf=str1.charAt(sayi);
            tersStr+=harf;

            sayi--;
        }
        System.out.println(tersStr);

    }
}