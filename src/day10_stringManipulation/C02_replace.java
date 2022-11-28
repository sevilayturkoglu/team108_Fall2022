package day10_stringManipulation;

public class C02_replace {
    public static void main(String[] args) {

        String str= "Java ogren, adana ye :)";
        System.out.println(str.replace('a', 'A')); // JAvA ogren, AdAnA ye :)
        System.out.println(str.replace(" ", "")); // Javaogren,adanaye:)
        System.out.println(str.replace("Java", "Yazilim")); // Yazilim ogren, adana ye :)
        String telefon="555 3451234";
        System.out.println(telefon.replace("555", "532")); // 532 3451234
        System.out.println(telefon.replace('3', '7')); // 555 7451274

        // asagidaki arama sonucunun 10 binden fazla oldugunu test edin
        String sonuc= "1-16 of over 100,000 results for \"apple\"";
        int over=sonuc.indexOf("over");
        int result=sonuc.indexOf(" result");
        sonuc=sonuc.substring(over+5,result);
        sonuc=sonuc.replace(",","");
        int sayi=Integer.parseInt(sonuc);

if(sayi>=10000){
    System.out.println("Test PASSED");
}else{
    System.out.println("sayi 10000 den FAILED");
}
    }
}
