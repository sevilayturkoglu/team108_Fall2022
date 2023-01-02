package day17_Arrays_Multi.SoruBen;

public class ArtikYil {
    public static void main(String[] args) {
int yilNo=2012;
        boolean artikYilMi;
        if(yilNo%4==0){
            if(yilNo%100==0){
                if(yilNo%400==0){
                    artikYilMi=true;
                }else {
                    artikYilMi=false;
                }
            }else{
                artikYilMi=true;
            }
        }else {
            artikYilMi=false;
        }
        System.out.println(artikYilMi);
    }
}