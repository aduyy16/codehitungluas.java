import java.util.Scanner;

public class luaskaran {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double r, luaslingka;

        System.out.println("Berapa jari - jari lingkaran anda : ");

        r = input.nextDouble();

        luaslingka = (r * r) * 3.14;

        System.out.println("Jadi luas lingkaran anda adalah : " + luaslingka);

    }

}
