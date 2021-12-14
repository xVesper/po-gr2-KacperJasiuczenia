import pl.imiajd.jasiuczenia.Osoba;
import pl.imiajd.jasiuczenia.Student;

import java.util.Collections;
import java.time.LocalDate;
import java.util.ArrayList;
import java.lang.Comparable;
import java.lang.Cloneable;

public class TestStudent{

    public static void main(String[] args){
        ArrayList<Osoba> grupa = new ArrayList<Osoba>();
        LocalDate data1 = LocalDate.of(2000, 07, 21);
        LocalDate data2 = LocalDate.of(2002, 06, 12);

        grupa.add(new Student("Jasiuczenia", data1, 4.4));
        grupa.add(new Student("Nowak", data1, 3.1));
        grupa.add(new Student("Jasiuczenia", data2, 3.7));
        grupa.add(new Student("Nowak", data2, 3.7));
        grupa.add(new Student("Nowak", data1, 4.1));

        System.out.println(grupa);
        Collections.sort(grupa);
        System.out.println(grupa);
    }
}
