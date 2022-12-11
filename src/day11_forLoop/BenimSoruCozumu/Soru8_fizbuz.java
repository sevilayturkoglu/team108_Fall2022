package day11_forLoop.BenimSoruCozumu;

public class Soru8_fizbuz {
    public static void main(String[] args) {
      /*  Soru 8 (interview)- Kullanicidan pozitif bir sayi alin, 1’den baslayarak tum
        tamsayilari yazdirin, sira
        - 3 ile bolunebilen bir sayiya gelirse, sayi yerine fizz
        - 5 ile bolunebilen bir sayiya gelirse sayi yerine buzz
        - hem 3 hem 5 ile bolunebilen bir sayiya gelirse sayi yerine fizzBuzz
        yazdirin*/

        int input=17;
        String fizzyBuzzy="";
        for (int i = 1; i <=input ; i++) {
            if(i%3==0&&i%5==0){
                fizzyBuzzy="fizzBuzz,";
            } else if (i%3==0) {
               fizzyBuzzy="fizz,";
            }else if(i%5==0) {
                fizzyBuzzy="buzz,";
            }else{
                fizzyBuzzy=i+",";
            }
            System.out.print( fizzyBuzzy);
        }

    }
}
