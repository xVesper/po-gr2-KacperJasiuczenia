package pl.imiajd.jasiuczenia;
import java.awt.*;

public class BetterRectangle extends Rectangle{
    public BetterRectangle(int x, int y, int width, int height){
        super(x, y, width, height);
        this.setLocation(x, y);
        this.setSize(width, height);
    }
    public int getPerimeter(){
        return this.width*this.height;
    }
    public int GetArea(){
        return this.width*2+this.height*2;
    }
}
