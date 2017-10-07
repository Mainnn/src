package Mane.Practica7;
//12.	Дана строка слов. Определить самое короткое слово в строке.


import java.util.Scanner;
public class Practica7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        do  {
            System.out.print("Строка: ");
            String str = scanner.nextLine();

            String shortestWord = str;
            for (String wrd : str.split("x"))
                if (wrd.length() < shortestWord.length())
                    shortestWord = wrd;

            System.out.println("Кароткое  (" + shortestWord.length() + " Слово)  " + shortestWord);
        }while (false);


    }
    }
