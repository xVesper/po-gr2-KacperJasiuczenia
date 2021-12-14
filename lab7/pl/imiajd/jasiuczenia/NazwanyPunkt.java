package pl.imiajd.jasiuczenia;

public class NazwanyPunkt extends Punkt {
    public NazwanyPunkt(int x, int y, String name){
        super(x,y);
        this.name = name;
    }
    public String getName(){
        return name;
    }
    public void show(){
        super.show();
        System.out.println(name);
    }
    private String name;
}
