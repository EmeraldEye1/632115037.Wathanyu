package week8;
public class biker{
    static int Speed;
    final private static int fixupanddown = 5;
    public biker(){
        
    }
    public void Speeder(int Speeder){
       Speed = Speeder;
    }
    public int Speed1(){
        return Speed;
    }
    public int Speed2(){
        return fixupanddown;
    }
    public void resultSpeed(){
        System.out.println("Speed is "+Speed1()+" km/h");
    }
    public boolean checkingSpeed(int receivespeed){
        if(receivespeed > 99){
            System.out.println("the speed is can't more then 99 !!!!!");
            return true;
        }
        else {
            return false;
        }
    }
}