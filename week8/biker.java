package week8;
public class biker{
    static double Speed;
    final private static int fixupanddown = 5;
    public biker(){
        
    }
    public void Speeder(double Speeder){
       Speed = Speeder;
    }
    public double Speed1(){
        return Speed;
    }
    public double Speed2(){
        return fixupanddown;
    }
    public void resultSpeed(){
        System.out.println("Speed is "+Speed1()+" km/h");
    }
    public boolean checkingSpeed(double receivespeed){
        if(receivespeed > 99){
            System.out.println("the speed is can't more then 99 !!!!!");
            return true;
        }
        else {
            return false;
        }
    }
}