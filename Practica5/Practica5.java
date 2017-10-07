package Mane.Practica5;

import java.util.Random;
public class Practica5 {
    public static void main(String arg[]){
        Random GGWP = new Random();
        final int N=8;

        int[] Miracle = new int[N];
        for(int i=0;i<N;i++){
            Miracle[i] =GGWP.nextInt(29)+1;
            System.out.print
                    (Miracle[i]+"\t");

        }
        System.out.println(" ");
        int p = N-1;
        for(int b=0;b<p;b++){
            if(Miracle[b ]> Miracle[b+1]){
                if(Miracle[b] > Miracle[b-1]){

                    System.out.println("Число больше соседнейй "+Miracle[b]+" индэкс "+b);
                }
            }
        }



    }
}