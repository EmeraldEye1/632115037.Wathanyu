package week13;

public class Shapeclient {
    public static void main(String [] args) {
        
        double base = 6, height = 9;
        Shape triangle = new Triangle(base, height);
        System.out.println("triangle base : " + base);
        System.out.println("height : " + height);
        System.out.println("area : " + triangle.getArea());

       
        double widthh = 13, lengthh = 9;
        Shape rectangle = new Rectangle(widthh, lengthh);
        System.out.println("rectangle width : " + widthh);
        System.out.println("length  " + lengthh);
        System.out.println("area : " + rectangle.getArea());
       
    
        
        double radius = 3;
        Shape circle = new Circle(radius);
        System.out.println("radius of the circle: " + radius);
        System.out.println("area: " + circle.getArea());
        
    }
}