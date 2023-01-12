package day32_Set_Map.BenimCozum;

import java.util.InputMismatchException;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class S1 {
    public static void main(String[] args) {
Scanner sc=new Scanner(System.in);

        List<String> list1 = new LinkedList<>();
        List<String> list2 = new LinkedList<>();
boolean control=true;
String element1="";

       while (control){
           try{

               System.out.println("Lutfen element1 e eleman giriniz isiniz bitince 0 a basiniz.");
               if(!(element1.equals("0"))){
                   list1.add(element1 = sc.nextLine());
               }/*else{
                   throw new RuntimeException();
               }*/
               System.out.println("Lutfen element2 ye e eleman giriniz isiniz bitince 0 a basiniz.");
               if(!(element1.equals("0"))) {
                   list2.add(element1 = sc.nextLine());
               }else{
                   throw new RuntimeException();
               }
           }catch (RuntimeException e){
               System.out.println("Eleman girme isleminiz sonlandirilmistir");
              control=false;
           }
       }
        System.out.println(list1);
        System.out.println(list2);
        list1.retainAll(list2);
        System.out.println("Ortak Karakterler= " + list1);
    }
}