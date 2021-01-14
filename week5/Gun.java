package week5;

public class Gun {

    public static void main(String[] args) {
    
    Gun1 gun1 = new Gun1();
    
    gun1.fire();
    
    gun1.reload(15);
    
    gun1.fire();
    
    gun1.fire();
    
    gun1.displayNumOfbullet();
    
    gun1.reload(2);
    
    gun1.displayNumOfbullet();
    
    gun1.displayGunID();
    
    Gun1 gun2 = new Gun1(15);
    
    gun2.displayGunID();
    
    gun2.fire();
    
    gun2.displayNumOfbullet();
    
    gun2.reload(2);
    
    gun2.displayNumOfbullet();
    
    }
    
    }

class Gun1 {
   
        private int bullet ;
        private static int Name ;
    
        public  Gun1(){
            bullet = 0;
            Name++;
        }
    
        public Gun1(int ammo){
            this.bullet = ammo;
            Name++;
        }
    
        public void fire() {
            if (bullet > 0 ){
                System.out.println("Pew !!!");
                bullet --;
            }
            else
            System.out.println("There is no ammuition");
        }
    
        public void reload(int r) {
            if (bullet+r<=15)
            bullet+=r;
            else
            System.out.println("Error!! the ammuition is overload");
        }
    
        public void displayNumOfbullet() {
            System.out.println(bullet+" bullet left");
        
        }
    
        public void displayGunID() {
            System.out.println("The ID of this gun is "+ Name);
        }
    
    }