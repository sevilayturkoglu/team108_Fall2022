package day09_StringManipulation;

public class C05_indexOf {
    public static void main(String[] args) {
        String str = "Java ile kodlama cok kolay";

        //str "cok" iceriyor mu

        System.out.println(str.contains("cok"));
        System.out.println(str.indexOf("coki"));//icermedigi icin indexi -1 cikar
        //yazdigimiz seylerin baslangic indexini verir
        System.out.println(str.indexOf('a'));
        System.out.println(str.indexOf("v"));
        System.out.println(str.indexOf("cok"));

//5.indexten sonraki ilk a yi bulalim
        System.out.println(str.indexOf("a", 5));

//ikinci o yu bulalim:
        System.out.println(str.indexOf("o"));//10
        System.out.println(str.indexOf("o", 11));

        int ilkO = str.indexOf("o");//ilk o nun indexini aldik
        System.out.println(str.indexOf("o", ilkO + 1));


    }
}
