package day16_arrays.BenimSoruCozumlerim;

public class Soru4 {
    public static void main(String[] args) {
        /*
        Soru 4- Verilen bir array’de istenen bir elemanin var olup olmadigini ve varsa kac kere
kullanildigini yazdiran bir method olusturun
         */
        int[]arr={2,5,7,8,2,3,2,15,18};
        int arananEleman=2;
        kacKereVarim(arr, arananEleman);
    }public static void kacKereVarim( int[]arr,int arananEleman){
        int count=0;
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]==arananEleman){
                count++;
            }
        }if(count==0){
            System.out.println("Aranan eleman burada degil");
        }else{
            System.out.println("Aranan elemandan " + count + " tane var");
        }
    }
}
