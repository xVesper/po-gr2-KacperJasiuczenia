package pl.edu.uwm.po.lab_13;

import java.io.FileNotFoundException;

public class Test {
    public static void main(String[] args) throws FileNotFoundException {
        //PriorityList lista= new PriorityList();
        //lista.wypisz();
        //lista.pisz();
        //lista.wypisz();

        Egzamin po = new Egzamin();
        po.dodaj("Grzegorz", "db");
        po.dodaj("Kacper","dbd");
        po.dodaj("Maciek","dst");
        po.dodaj("Dawid","db+");
        po.wypisz();
        po.usun("Maciek");
        po.zmien("Dawid","dst+");
        po.wypisz();

        Egzamin2 po2= new Egzamin2();
        po2.dodaj(new Student("Kacper","Jasiuczenia",4),"bdb");
        po2.dodaj(new Student("Grzegorz","Lenks",3),"db");
        po2.dodaj(new Student("Kacper","Jasiuczenia",1),"dst");
        po2.dodaj(new Student("Kacper","Jasiuczenia",2),"ndst");
        po2.wypisz();
        po2.usun(3);
        po2.zmien(2,"dst+");
        po2.wypisz();

        FunMieszajaca fm= new FunMieszajaca("alice30.txt");
    }
}