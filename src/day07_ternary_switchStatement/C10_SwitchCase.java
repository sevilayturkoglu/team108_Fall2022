package day07_ternary_switchStatement;

public class C10_SwitchCase {
    public static void main(String[] args) {
         //Kullanıcıdan gün numarası alın
        //Haftaiçi veya haftasonu olduğunu yazdırın.
        int gunNo = 3;

        switch (gunNo) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Haftaiçi");
                break;
            case 6:
            case 7:
                System.out.println("Haftasonu");
                break;
            default:
                System.out.println("Geçersiz gün sayısı");


//kisa yapiisi
        /*switch (gunNo) {
            case 1, 2, 3, 4, 5 -> System.out.println("Hafta ici ");
            case 6, 7 -> System.out.println("hafta sonu");
            default -> System.out.println("gecersiz gun adi");*/
        }
    }
}
