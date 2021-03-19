package week8;
public class bike extends biker{

    public bike(double Speed){
        Speeder(Speed);
        System.out.println("Common Bike");
        if(checkingSpeed(Speed1())){
            Speeder(Speed1()-Speed);
        }
    }
    public void speedup(){
        Speeder(Speed1()+ Speed2());
        if (checkingSpeed(Speed1())) {
            Speeder(Speed1() - Speed2());
        }
    }

    public void Break() {
        Speeder(Speed1() - Speed2());
    }
}
