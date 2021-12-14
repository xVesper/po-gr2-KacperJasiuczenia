import pl.imiajd.jasiuczenia.Osoba;

import java.util.Collections;
import java.time.LocalDate;
import java.util.ArrayList;
import java.lang.Comparable;
import java.lang.Cloneable;

public class TestOsoba{

    public static void main(String[] args){
        ArrayList<Osoba> grupa = new ArrayList<Osoba>();
        LocalDate data1 = LocalDate.of(2000, 07, 21);
        LocalDate data2 = LocalDate.of(2002, 03, 12);

        grupa.add(new Osoba("Jasiuczenia", data1));
        grupa.add(new Osoba("Nowak", data1));
        grupa.add(new Osoba("Jasiuczenia", data2));
        grupa.add(new Osoba("Nowak", data2));
        grupa.add(new Osoba("Nowak", data1));

        System.out.println(grupa);
        Collections.sort(grupa);
        System.out.println(grupa);
    }
}
