import java.util.Scanner;

public class LuasPersegi { 
    public static void main (String [] args) {


        int a, luaspersegi;

        Scanner input = new Scanner(System.in);

        System.out.println("Berapa nilai sisi persegi");

        a = input.nextInt();

        luaspersegi = a*a ;

        System.out.println ("Jadi Luas Perseginya adalah : " +luaspersegi);
    }
    
}
