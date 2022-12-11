package day17_Arrays_Multi.SoruBen;

public class Soru5 {
    public static void main(String[] args) {
        /*
        Soru 5- Verilen 2 katli bir array’de her bir inner array’in son elementlerinin
toplaminini yazdiran bir method olusturun
         */

        int[][] arr = {{3,1,2,4},{1,2},{3,4,5},{3},{1,2,11}};

         int a=arr[0][arr[0].length-1];

           System.out.println(toplaGetir(arr));
    }public static int toplaGetir(int[][] arr){
       int toplam=0;
        for (int i = 0; i < arr.length ; i++) {

            toplam+= arr[i][arr[i].length-1];

        } return toplam;
        /*
        int say = arr[0][arr[0].length - 1];


        int toplam = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = arr[i].length-2; j <= arr[i].length-2; j++) {

                toplam += arr[i][j];
            }


        } System.out.println(toplam);
         */
    }
}
