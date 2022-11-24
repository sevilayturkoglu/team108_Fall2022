package day07_ternary_switchStatement;

public class C14_SoruBen {
    public static void main(String[] args) {
        /*
        Soru 6- Kullanicidan ay numarasini alip mevsimi yazdirin
         */
        int ayNo=10;
        switch (ayNo){
            case 12: case 1: case 2:
                System.out.println("Kis mevsimi ");
                break;
            case 3: case 4: case 5:
                System.out.println("Ilkbahar mevsimi");
                break;
            case 6: case  7: case 8:
                System.out.println("Yaz mevsimi");
                break;
            case 9: case 10: case 11:
                System.out.println("Sonbahar mevsimi");
                break;
            default:
                System.out.println("Boyle bir ay adi yok");

        }
    }
}
