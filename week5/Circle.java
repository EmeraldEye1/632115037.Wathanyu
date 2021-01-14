\\632115037 Wathanyu
package week5;

public class Circle {
    public static void main(String[] args) {
    Circleee circle1 = new Circleee(0, 0, 2.0);
    Circleee circle2 = new Circleee(1.0, 2.0, 3.0);
    Circleee circle3 = new Circleee(3.0, 5.0);
    Circleee circle4 = new Circleee(-1.0, -1.0, -1.0);

    System.out.println("Area of cir1 = "+ circle1.gettheArea());
    System.out.println("Circumferrene of cir1= "+ circle1.gettheCircum());
    System.out.println("Area of cir2 = "+ circle2.gettheArea());
    System.out.println("Circumferrene of cir2= " + circle2.gettheCircum());
    System.out.println("Area of cir3 = "+ circle3.gettheArea());
    System.out.println("Circumferrene of cir3= " + circle3.gettheCircum());
    System.out.println("Area of cir4 = "+ circle4.gettheArea());
    System.out.println("Circumferrene of cir4= " + circle4.gettheCircum() );
    System.out.println("Is ciecle 1 intersec circle 2; "+circle1.intersec(circle2));
    System.out.println("Is ciecle 1 intersec circle 3; "+circle1.intersec(circle3));

    }

}

class Circleee{
    private double x;
    private double y;
    private double r;

    public Circleee(double x, double y,double r){
        this.x = x;
        this.y = y;
        this.r = r;
        if(this.r<0)
         this.r = 0.0;
    }

    public Circleee(double x,double y){
        this(x, y, 1.0);
    }

    public double gettheArea(){
        return Math.PI*Math.pow(r,2);
    }

    public double gettheCircum(){
        return Math.PI*2*r;
    }

    public boolean intersec(Circleee circle ){
        double phase ;

        phase = Math.sqrt(Math.pow(this.x-circle.x,2)+Math.pow(this.y-circle.y,2));
        if (phase < this.r+circle.r)
         return true;
         else
         return false;
    }
}
