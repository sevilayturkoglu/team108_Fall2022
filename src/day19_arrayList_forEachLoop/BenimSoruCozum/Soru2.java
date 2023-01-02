package day19_arrayList_forEachLoop.BenimSoruCozum;

public class Soru2 {
    /*
    Soru 2- Verilen int array’deki her elementin karelerini alip, karelerinin toplamini
yazdiran bir method olusturun
     */
    public static void main(String[] args) {
        int[] mukerrer = {2, 4, 5, 3, 6, 7};

karelerTop(mukerrer);
    }public static void karelerTop(int[] mukerrer){
        int top=0;
        for (int each:mukerrer
             ) {
            top+=each*each;

        }
        System.out.println(top);
    }
}

