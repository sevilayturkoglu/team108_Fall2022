package Alistirma_GenelTekrar;

public class Ternary {
    public static void main(String[] args) {

        //haftanin gunlerini bul
        int day=1;
        System.out.println(day == 1 ? "Monday" : day == 2 ? "Tuesday" : day == 3 ? "Wednesday" : day == 4 ? "Thuresday"
                : day == 5 ? "Friday" : day == 6 ? "Saturday" : day == 7 ? "Sunday" : "gecerli gun degil");
    }
}
