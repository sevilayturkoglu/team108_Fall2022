package Alistirma_GenelTekrar.day2;

public class BirSonrakiSaate_kacDK {
    //Bir sonraki saate kac dk daha var oldugunu hesaplayan method yaziniz
    public static void main(String[] args) {
        System.out.println(nextHour("1:15"));
        System.out.println(nextHour("11:57"));
    }

    public static int nextHour(String time) {
        int minutes=Integer.parseInt(time.substring(time.indexOf(":")+1));
        System.out.println(minutes);
        return 60-minutes;
    }
}
