package week8;
    public class mountainbike extends biker{
        public mountainbike(double Speed){
            Speeder(Speed);
            System.out.println("MountainBike");
            if(checkingSpeed(Speed1())){
                Speeder(Speed1()-Speed);
            }
        }
        public void Speedup(int gearR){
            Speeder(Speed1()+(gearR* Speed2()));
            if (checkingSpeed(Speed1())) {
                Speeder(Speed1() - (gearR * Speed2()));
            }
        }
    
        public void BreakBike() {
            Speeder(Speed1() - Speed2());
        }
    }

