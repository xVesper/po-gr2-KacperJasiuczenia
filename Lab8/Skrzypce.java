package Instrumenty;
import java.time.LocalDate;

public class Skrzypce extends Instrument
{
    public Skrzypce(String producent, LocalDate rokProdukcji)
    {
        super(producent, rokProdukcji);
    }

    @Override
    public void dzwiek()
    {
        System.out.println("tzzzzztzzzzz");
    }
}
