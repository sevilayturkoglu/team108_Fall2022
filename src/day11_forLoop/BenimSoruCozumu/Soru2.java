package day11_forLoop.BenimSoruCozumu;

public class Soru2 {
    public static void main(String[] args) {
        /*Soru 2- Kullanicidan pozitif bir tamsayi alin, 1’den girilen sayiya kadar(girilen sayi
        dahil) 7 ila bolunebilen sayilari yazdirin*/
        int input=75;
        for (int i = 1; i <=input; i++) {
            if(i%7==0){
                System.out.print( i + " ");
            }
        }
    }
}
