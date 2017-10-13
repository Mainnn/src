package Practica9;
//Имеется текстовый файл.
// Напечатать символы с s1-го по 2-й из каждой строки
        import java.util.*;
        import java.io.FileReader;
        import java.io.FileWriter;
        import java.io.*;

public class Practica9 {
    public static void main(String arg[])throws  Exception{
        Scanner scn = new Scanner(System.in);

        File fl =new File("mane.txt");
            fl.createNewFile();
        System.out.println("ВВедите колчиство строк");
            int n=scn.nextInt();

            FileWriter Fw = new FileWriter(fl);
            for(int i=0;i<n;i++) {
                System.out.println("Введите "+i+" строку");
                    Fw.write(scn.nextLine() + "\n");
            }
            Fw.close();

            FileReader fr=new FileReader(fl);
        BufferedReader buff =new BufferedReader(fr);
        while (buff.ready()){
           // if("".equals(buff.readLine());
            //    System.out.println("я в правильном напровлении");
            }
            System.out.println(buff.readLine());

        }
            }



