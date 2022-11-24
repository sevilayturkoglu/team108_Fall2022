package day03_dataCasting_MatematikselIslemler;

public class OrnekSoru2 {
    public static void main(String[] args) {
        // Soru 2- Kullanicidan bir harf alin ve alfabede o harften sonraki 3 harfi yazdirin.

        char kulHar='a';
        System.out.println(+kulHar);//97
        System.out.println((char)(kulHar + 1) +"-"+ (char)(kulHar + 2) +"-"+ (char) (kulHar + 3));

    }
}
