package Practica9;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class f {
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        System.out.print("Количество слов = ");
        int n = scn.nextInt();
        scn.nextLine();
        FileWriter fw = new FileWriter("MyText.txt");
        for (int i = 0; i < n; i++) {
            System.out.print("Слово - ");
            fw.write(scn.nextLine() + "\n");
        }
        fw.close();

        FileWriter fw2 = new FileWriter("Mymane12=.txt");
        FileReader fr = new FileReader("Text2.txt");
        Scanner reader = new Scanner(fr);
        while (reader.hasNextLine()) {
            String str = reader.nextLine();
            if (str.charAt(0) == 'А') {
                fw2.write(str + "\n");
            }
        }
        fw2.close();
        fr.close();
    }
}

