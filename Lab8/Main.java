import Instrumenty.Instrument;
import Instrumenty.Flet;
import Instrumenty.Fortepian;
import Instrumenty.Skrzypce;
import java.time.LocalDate;
import java.util.ArrayList;

public class Main
{

    public static void main(String[] args)
    {
        ArrayList<Instrument> orkiestra = new ArrayList<Instrument>();
        orkiestra.add(new Flet("CaleTe", LocalDate.now()));
        orkiestra.add(new Fortepian("Knur", LocalDate.now()));
        orkiestra.add(new Skrzypce("WashAndGo", LocalDate.now()));
        for (int i = 0; i <= orkiestra.size() - 1; i++)
        {
            orkiestra.get(i).dzwiek();
        }
    }
}
