package Practica10;

public class Metod10 {
    int chislo;
    int per;
    int vtor;
    int tret;
    int chet;
    int Spv;
    int Stc;
    void vanClass() {
        per = chislo / 1000;
        vtor = chislo / 100 % 10;
        tret = chislo / 10 % 10;
        chet = chislo / 1 % 10;
    }
    void tocClass(){
        this.per=per;
        this.vtor=vtor;
        this.tret=tret;
        this.chet=chet;
        Spv=per+vtor;
        Stc=tret+chet;
        if(Spv==Stc){
            System.out.println("Числа равны");

        }else System.out.println("Не равны");



    }


    }

