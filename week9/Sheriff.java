package week9;
public class Sheriff extends Person {
    String workState;
public Sheriff (String name,int bornYear ,String workState){
       super(name,bornYear);
       this.workState =workState;
}
public void introduce(){
   
    System.out.println("I'm a Sheriff and work in" + workState+".");
}

    }
    

