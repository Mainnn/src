package Practica7;
//12.	Дана строка слов. Определить самое короткое слово в строке.


import java.util.Scanner;
public class practiva7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


            System.out.print("Строка: ");
            String str = scanner.nextLine();


            String shor = str;
            for (String wrd : str.split(" "))
                if (wrd.length() < shor.length())
                shor = wrd;


            System.out.println("lo;i4estvo simvolov  (" + shor.length() + " )Слово  " + shor);




    }
}
