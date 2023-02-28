package Alistirma_GenelTekrar.day2;

public class vowels {
    public static void main(String[] args) {
        //bir stringin icinde bulunan sesli harf sayisini return eden bir method yaziniz

        int a=kacSesli("sevilay");
        System.out.println(a);

       int b= sesliBul("sevilay");
        System.out.println(b);

       int c= sesliBulma("sevilay");
        System.out.println(c);

        int d=sesliBulmaca("sevilay");
        System.out.println(d);
    }

    private static int sesliBul(String str) {
        int count=0;
        String []arr=str.split("");
        String ses="aeiou";
        for (int i = 0; i < arr.length ; i++) {
             if(ses.contains(arr[i])) {
                count++;
            }
        }return count;

    }

    public static int kacSesli(String str) {
        int count=0;

        for (char each:str.toCharArray()
             ) {if(each=='a'||each=='e'||each=='i'||each=='o'||each=='u'){
                 count++;
             }
        }return  count;

    }public static int sesliBulma(String str) {
        int count=0;
        String ses="aeiou";
        for (String each:str.split("")) {
            if(ses.contains(each)) {
                count++;
            }
        }return count;

    }public static int sesliBulmaca(String str) {
        int count=0;
        String ses="aeiou";
        for (char each:str.toCharArray()) {
            if(ses.contains(""+each)) {
                count++;
            }
        }return count;

    }

}
