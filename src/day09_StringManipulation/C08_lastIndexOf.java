package day09_StringManipulation;

public class C08_lastIndexOf {
    public static void main(String[] args) {
        String str = "Javayi iyi ogrenmek icin cok calismam lazim cok";
        //ilk a nin inxexini alalim
        System.out.println(str.indexOf("a"));//1

        // son a nin indexini bul
        System.out.println(str.lastIndexOf("a"));//39

        System.out.println(str.lastIndexOf("i", 8));//sondan baslayarak yaapar 7 bulur


        // yukarida verilen str'da cok kelimesinin kullanimini kontrol edip
        // - cok kelimesi kullanilmamis
        // - bir kere kullanilmis
        // - birden fazla kullanilmis
        // sonuclarindan uygun olani yazdirin


        int ilk=str.indexOf("cok");
        int last=str.lastIndexOf("cok");

        if(!str.contains("cok")){
            System.out.println("cok kullanilmamis");
        } else if (ilk==last) {
            System.out.println("Bir  kez kullanilmis");

        }else{
            System.out.println("Birden cok kullanilmis");
        }

    }
}
