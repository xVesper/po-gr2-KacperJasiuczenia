package Instrumenty;

import java.time.LocalDate;

public class Flet extends Instrument
{
    public Flet (String producent, LocalDate rokProdukcji)
    {
        super(producent, rokProdukcji);
    }

    @Override
    public void dzwiek()
    {
        System.out.println("trututuut");
    }
}
