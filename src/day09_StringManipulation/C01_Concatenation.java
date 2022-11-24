package day09_StringManipulation;

public class C01_Concatenation {
    public static void main(String[] args) {
        String str1= "Java";
        String str2= "candir";
        System.out.println(str1+ " " + str2); // Java candir
        System.out.println(str1.concat(str2)); // Javacandir
        System.out.println(str1.concat(" ").concat(str2.substring(0,1)
                .toUpperCase()+str2.substring(1))); // Java candir,araya bosluk attik
//string metotlari istedigimiz kadar yan yana ekleyebiliriz
    }
}
