package week5;

public class TestCircle {
    public static void main(String[] args) {
        Circle myCircle = new Circle(5.0);
        myCircle.radius = 10;
        System.out.println("The area of the circle of radius " + myCircle.getRadius() + "is" + myCircle.getArea());
        System.out.println("The area of the circle of radius " + myCircle.getRadius() + "is" + myCircle.getArea());

        // test#1
        System.out.println(myCircle.radius);
        // test#2
        System.out.println(myCircle.getNumberofObjects());
        // test#3
        System.out.println("The number of object is "+myCircle .getNumberofObjects());
        // test#4
        myCircle.setNumberofObject(10);
        System.out.println("The number of object is");
        myCircle.getNumberOfObject();
    }


}
