package day07_ternary_switchStatement;

public class C07_NestedTernary {
    public static void main(String[] args) {
        /*Kullanicidan bir tamsayi alin.
        Sayi pozitifse, cift sayi veya cift sayi degil seceneklerinden uygun olani yazdirin
        Sayi pozitif degilse, 3 basamakli veya 3 basamakli degil seceneklerinden uygun olani yazdirin*/

        int sayi= -126;

        System.out.println(sayi > 0
                ?
                sayi % 2 == 0 ? "cift sayi" : "tek sayi"
                :
                sayi < -99 && sayi >= -999 ? "sayi 3 basamakli negatif" : "negatif sayi uc basamakli degil");

        System.out.println(sayi>0 ? sayi%2==0 ? "cift sayi" : "tek sayi" :sayi < -99 && sayi >= -999 ? "3 basamakli" : "3 basamakli degil");
    }
}
