package Instrumenty;

import java.time.LocalDate;

public class Fortepian extends Instrument
{
    public Fortepian(String producent, LocalDate rokProdukcji)
    {
        super(producent, rokProdukcji);
    }

    @Override

    public void dzwiek()
    {
        System.out.println("tititittitiitt");
    }
}
