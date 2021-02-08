package week9;

public class polymor8 extends Person{
        String p;
        String workState;
    public polymor8 (String name,int bornYear ,String workState,String p){
           super(name,bornYear);
           this.workState =workState;
           this.p=p;
    }
    public void introduce(){
        super.introduce();
        System.out.println("I'm a " + workState+" and "+  p);
    }
    
        }

    

