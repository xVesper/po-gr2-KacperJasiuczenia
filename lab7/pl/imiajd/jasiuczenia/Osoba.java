package pl.imiajd.jasiuczenia;


public class Osoba {
    protected String nazwisko;
    protected int rokUrodzenia;

    public Osoba(String nazwisko, int rokUrodzenia){
        this.nazwisko = nazwisko;
        this.rokUrodzenia = rokUrodzenia;
    }

    public String getNazwisko() {
        return this.nazwisko;
    }

    public int getRokUrodzenia() {
        return this.rokUrodzenia;
    }

    public String toString(){
        return String.valueOf(this.rokUrodzenia) + "\n" + this.nazwisko;
    }
}
