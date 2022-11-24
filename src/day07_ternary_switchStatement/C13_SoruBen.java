package day07_ternary_switchStatement;

public class C13_SoruBen {

    public static void main(String[] args) {
        //Soru 1- Kullanicidan bir rakam alip, rakami yaziyla yazdirin
        int sayi = 1;

       /* switch (sayi) {
            case 0 -> System.out.println("Sifir");
            case 1 -> System.out.println("Bir");
            case 2 -> System.out.println("Iki");
            case 3 -> System.out.println("Uc");
            case 4 -> System.out.println("Dort");
            case 5 -> System.out.println("Bes");
            case 6 -> System.out.println("Alti");
            case 7 -> System.out.println("Yedi");
            case 8 -> System.out.println("Sekiz");
            case 9 -> System.out.println("Dokuz");
            default -> System.out.println("Boyle bir rakam yok");*/

            switch (sayi) {
                case 0:
                    System.out.println("Sifir");
                    break;
                case 1:
                    System.out.println("Bir");
                    break;
                case 2:
                    System.out.println("Iki");
                    break;
                case 3:
                    System.out.println("Uc");
                    break;
                case 4:
                    System.out.println("Dort");
                    break;
                case 5:
                    System.out.println("Bes");
                    break;
                case 6:
                    System.out.println("Alti");
                    break;
                case 7:
                    System.out.println("Yedi");
                    break;
                case 8:
                    System.out.println("Sekiz");
                    break;
                case 9:
                    System.out.println("Dokuz");
                    break;
                default:
                    System.out.println("Boyle bir rakam yok");
        }
    }
}