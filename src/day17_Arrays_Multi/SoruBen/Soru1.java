package day17_Arrays_Multi.SoruBen;

public class Soru1 {
    public static void main(String[] args) {
        /*
        Soru 1- Verilen 2 katli bir array’de bulunan cift sayilari toplayip, sonucu yazdiran bir
method olusturun
         */
        int[][] arr = {{3, 4, 5}, {2, 3, 6, 7}, {8, 6, 9}};

        ciftleriTopla(arr);
    }public static void ciftleriTopla( int[][] arr){
        int toplam=0;
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr[i].length; j++) {

               if(arr[i][j]%2==0){
                   toplam+=arr[i][j];
               }

            }
        }
        System.out.println("toplam = " + toplam);
    }
}
