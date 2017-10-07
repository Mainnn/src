package Mane.Practica3;


import java.util.*;
class Practica3 {
    public static void main(String args[]){
        double summa=0;
        int g=0;
        double a;
        for(int i=0;summa<1000;i++){
            a=Math.pow(-1,i)*(Math.pow(i,2)+1)/(i+2);
            if(a>0){
                summa = summa + a;

                g++;
            }

        }
        System.out.println(g+"коилчество положительных чисел"+summa);




    }




}

