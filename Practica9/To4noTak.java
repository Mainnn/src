package Practica9;
import java.io.*;
import java.util.*;
public class To4noTak {
    public static void main(String arg[])throws Exception{
        FileReader RD=new FileReader("mane12.txt");
        System.out.println("Ввведите s1");
        Scanner s =new Scanner(System.in);

        final int G=s.nextInt();
        System.out.println("В ведите s2");
        Scanner scn = new Scanner(RD);
        final int H=s.nextInt();
        while (scn.hasNextLine()){



            String str = scn.nextLine();

            System.out.print(str.charAt(G)+"\t");
            System.out.print(str.charAt(H)+"\n");


        }
    }
}
