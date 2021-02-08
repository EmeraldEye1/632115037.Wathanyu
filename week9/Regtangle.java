package week9;

public class Regtangle  extends Shape{
    int height ;
    int width ;

    public Regtangle(int width,int height){
        
        this.width=width;
        this.height=height;

    }
    public String toString(){
      return super.toString()+"This is a rectangle with width as "+height+" and height as " +width+"\n";

    }
    
}
