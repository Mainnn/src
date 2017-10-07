package Practica7;
import java.util.Scanner;
public class trst {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        do  {
            System.out.print("Строка: ");
            String str = scanner.nextLine();
            if ("".equals(str))
                break;

            String shortestWord = str;
            for (String wrd : str.split(" "))
                if (wrd.length() < shortestWord.length())
                    shortestWord = wrd;

            System.out.println("Кароткое  (" + shortestWord.length() + " Слово)  " + shortestWord);
        }while (false);


    }
}
