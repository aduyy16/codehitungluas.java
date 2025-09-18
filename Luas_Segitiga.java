import java.util.Scanner;



public class Luas_Segitiga {

    public static void main (String [] args) {

        double a, t, luas;

        Scanner input = new Scanner(System.in);

        System.out.println("Masukan Nilai Alas Segitiga : ");

        a = input.nextDouble();

        System.out.println("Masukan Nilai Tinggi Segitiga : ");

        t = input.nextDouble();

        luas = (a*t)/2;

        System.out.println("Jadi Luas Segitiganya adalah : " +luas);
    }
    
}
