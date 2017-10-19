package Practica10;
//⦁	Написать класс,
// определяющий равна ли сумма двух первых чисел четырехзначного числа,
// сумме его двух последних чисел.
// Написать тестовый класс для проверки

import java.util.*;
public class Practica10 {
    public static void main(String arg[]){
        Scanner n=new Scanner(System.in);
        System.out.println("введите 4-х значное число");
        int chislo=n.nextInt();
        Metod10 met=new Metod10();
        met.chislo=chislo;
        met.vanClass();
        met.tocClass();
    }


}
