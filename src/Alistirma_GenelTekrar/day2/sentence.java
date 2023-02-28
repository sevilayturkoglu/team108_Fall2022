package Alistirma_GenelTekrar.day2;


public class sentence {
    public static void main(String[] args) {
        //Stringi cumlerine ayirip ,her cumlenin bas harfini buyuk yapin,sonlarina da nokta koyun

        String fix = capitalize3("java is cool. i LOVE to program. i want TO KEEP LEARNING.");
        System.out.println(fix);
        String fix1 = capitalize2("java is cool. i LOVE to program. i want TO KEEP LEARNING.");
        System.out.println(fix1);
        String fix2 = capitalize("java is cool. i LOVE to program. i want TO KEEP LEARNING");
        System.out.println(fix2);
    }

    public static String capitalize(String str) {
        String[] arr = str.split("\\. ");// . dan ayirmak icin\\ kullanmak zorundayiz cunki characterleri  harf gibi kabul etmiyor
        String fixed = "";
        for (String each : arr
        ) {
            fixed += each.substring(0, 1).toUpperCase() + each.substring(1).toLowerCase() + ".".trim();

        }
        return fixed.replace("..",".");
    }

    public static String capitalize2(String str) {
        String[] arr = str.split("\\. ");// . dan ayirmak icin\\ kullanmak zorundayiz cunki characterleri  harf gibi kabul etmiyor
        String fixed = "";
        for (int i = 0; i < arr.length; i++) {
            fixed += arr[i].substring(0, 1).toUpperCase() + arr[i].substring(1).toLowerCase() + ".".trim();
        }
        return fixed.replace("..",".");
    }

    public static String capitalize3(String str) {
// bu tam olmadi
        String fixed = "";
       while (str.contains(".")){
           String sentence=str.substring(0,str.indexOf(".")+1);
           fixed+=sentence.substring(0,1).toUpperCase()+sentence.substring(1).toLowerCase();
          str=str.replace(sentence,"");
       }

        return fixed;
    }
}