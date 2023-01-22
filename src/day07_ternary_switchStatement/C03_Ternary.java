package day07_ternary_switchStatement;

public class C03_Ternary {
    public static void main(String[] args) {
        // input olarak verilen sayiyi kontrol edip
        // sayi cift ise "cift sayi"
        // degilse "tek sayi" yazdirin

        int input=44;
        // if else ile yapalim
        if (input%2==0){
            System.out.println("cift sayi");
        } else {
            System.out.println("tek sayi");
        }

        // ternary ile yapalim
        System.out.println(input%2==0 ? "Cift sayi" : "Tek sayi");

        //gun bulalim  *************

        int day=1;
        System.out.println(day == 1 ? "Monday" : day == 2 ? "Tuesday" : day == 3 ? "Wednesday" : day == 4 ? "Thuresday"
                : day == 5 ? "Friday" : day == 6 ? "Saturday" : day == 7 ? "Sunday" : "gecerli gun degil");

    }
}
