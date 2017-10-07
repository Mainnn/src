package Practica8;
/*15.	Спи12сочный массив состоящий из N элементов заполнить случайными числами.
 Заменить все отрицательные элементы модулем этого числа,
  а положительные заменить на отрицательное
  */
import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
public class Practica8 {
    public static void main(String arg[]){
        Scanner scn=new Scanner(System.in);
        Random rn=new Random();
        int j;
        int G;
ArrayList<Integer> L=new ArrayList<>();
System.out.println("число элементов:");
int n=scn.nextInt();
for(int i=0;i<n;i++) {
    L.add(rn.nextInt(20) -10);
}
    System.out.println("Исходный список:");
    for (int i : L) {
        System.out.print(i + " ");

    }
        System.out.println(" ");
    for(int i=0;i<n;i++){
        if(L.get(i)>0){
            G=L.get(i)*(-1);


            L.set(i,G);
            System.out.print(L.get(i) + " ");

        }else if(L.get(i)<0){

            j=Math.abs(L.get(i));
            System.out.print(j);
        }
    }


}
    }

