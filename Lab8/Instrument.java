package Instrumenty;
import java.time.LocalDate;


public abstract class Instrument {
    private String producent;
    private LocalDate rokProduckji;

    public Instrument(String producent, LocalDate rokProduckji) {
        this.producent = producent;
        this.rokProduckji = rokProduckji;
    }

    public String getProducent() {
        return producent;
    }

    public LocalDate getrokProdukcji()
    {
        return rokProduckji;
    }
    public abstract void dzwiek();

    public boolean equals(String producent, LocalDate rokProdukcji)
    {
        if(this.producent.equals(producent) && this.rokProduckji.equals(rokProdukcji))
            return true;
        return false;
    }
    public String toString()
    {
        return "producent - " + this.producent + "rok produkcji - " + this.rokProduckji.toString();
    }

}

