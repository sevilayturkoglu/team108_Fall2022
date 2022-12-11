package day11_forLoop;

public class C06_fizz_buzz {
    /*
    Soru 8 (interview)- Kullanicidan pozitif bir sayi alin, 1’den baslayarak tum tamsayilari yazdirin, sira
 - 3 ile bolunebilen bir sayiya gelirse, sayi yerine fizz
 - 5 ile bolunebilen bir sayiya gelirse sayi yerine buzz
 - hem 3 hem 5 ile bolunebilen bir sayiya gelirse sayi yerine fizzBuzz yazdirin
     */
    public static void main(String[] args) {


        int kullaniciSayi = 15;
        String kaime="";
        for (int i = 1; i <=kullaniciSayi ; i++) {

            if(i%3==0 && i%5==0){
                kaime="fizzBuzz ,";
            } else if (i%3==0) {
                kaime="fizz ,";
            }else if (i%5==0) {
                kaime="buzz ,";
            }else{
               kaime= i+" ,";
            }
            System.out.print(kaime);
        }
    }
}