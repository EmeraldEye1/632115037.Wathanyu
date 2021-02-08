package week9;

public class Shape {
    public String toString(){
        return "this is shape"+"\n";

    }
  
    public static void main(String[] args) {
        Cube c ;
        c = new Cube(3,3,1);
       System.out.println(c.toString());
        
        
    }
    
}

