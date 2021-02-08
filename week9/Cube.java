package week9;

public class Cube extends Regtangle{
    int length ;
    public Cube(int height,int width,int length){
        super(width, height);
        this.length= length;


    }
    public String toString(){
        return super.toString()+"This is a cube with the side of  " + length;
        
        
    }
    

    
}
