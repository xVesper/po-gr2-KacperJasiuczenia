package pl.imiajd.jasiuczenia;


public class Nauczyciel extends Osoba{
    private int pensja;

    public Nauczyciel(String nazwisko, int rokUrodzenia, int pensja){
        super(nazwisko, rokUrodzenia);
        this.pensja = pensja;
    }

    public int getPensja(){
        return this.pensja;
    }
    public String toString(){
        return String.valueOf(this.rokUrodzenia) + "\n" + this.nazwisko + "\n" + this.pensja;
    }
}
