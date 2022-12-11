package day16_arrays.BenimSoruCozumlerim;

public class Soru2 {
    public static void main(String[] args) {
       /* Soru 2- Verilen bir array’deki pozitif tamsayilari toplayip sonucu bize donduren bir
        method yaziniz*/
        int[]arr={1,-5,2,3,4,8,-6,-7,14};
        System.out.println(pozitifTopla(arr));

    }public static int pozitifTopla(int[]arr){
        int toplam=0;
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]>=0){
                toplam+=arr[i];
            }
        }
        return toplam;
    }
}
