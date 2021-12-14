import pl.imiajd.jasiuczenia.Adres;
import pl.imiajd.jasiuczenia.BetterRectangle;
import pl.imiajd.jasiuczenia.Student;
import pl.imiajd.jasiuczenia.Nauczyciel;
import pl.imiajd.jasiuczenia.Punkt;
import pl.imiajd.jasiuczenia.NazwanyPunkt;

public class Test {
    public static void main(String[] args){
        Adres a = new Adres("Kowalska", 7, "Ostrołęka", 06120);
        Adres aa = new Adres("Kowalska", 4, 21, "Ostrołęka", 15210);
        a.pokaz();
        aa.pokaz();
        System.out.println(a.przed(aa));
        Student s = new Student("Nowak", 2000, "Informatyka");
        System.out.println(s.toString());
        Nauczyciel n = new Nauczyciel("Kowalski", 1968, 100);
        System.out.println(n.toString());
        BetterRectangle r = new BetterRectangle(2, 6, 2, 4);
        System.out.println(r.getPerimeter());
        System.out.println(r.GetArea());
        NazwanyPunkt x = new NazwanyPunkt(3, 5, "Jeden");
        Punkt y = new Punkt(4, 7);
        Punkt z = new NazwanyPunkt(5, 11, "Dwa");
        System.out.println(x.getName());
        x.show();
        y.show();
        z.show();
    }
}
