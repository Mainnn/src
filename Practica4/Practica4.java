package Mane.Practica4;

import java.util.Scanner;
public class Practica4 {
    public static void main(String arg[]){
        Scanner n = new Scanner(System.in);
        double a;
        int b;
        int f=0;
        double summa = 0;
        while (summa<1000){
            System.out.println("Число");
            int i =n.nextInt();


            a = Math.pow(-1,2)*((Math.pow(i,2)+1)/(i+2));



            if(a>0){
                f++;
                summa =summa + a;
            }
        }
        System.out.print(+f+" Вот такое количество надо чтобы их сумма привысила 1000\t");
        System.out.print("Сумма =\t"+summa);

    }
}
