package Mane.Practica;

/**
 * Created by Студент on 07.10.2017.
 */
import java.util.Scanner;
public class Scaner {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        int r, b;
        System.out.println("Радиус");
        r = scan.nextInt();
        System.out.println("Сторона вкадрата ");
        b = scan.nextInt();
        double Sk = Math.pow(r, 2);
        double Skvt = Math.pow(b, 2);
        if (Sk > Skvt) System.out.println("Площадь круга больше " + Sk);
        if (Sk < Skvt) System.out.println("Площадь квадрата больше " + Skvt);
    }
}
