package week13;

public class Triangle extends Shape {
    private double base, height; 
    public Triangle() {
     
        this.base = 1;
        this.height = 1;
    }
    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }
    
    public double getArea() {
        return 0.5* base * height;
    }
}
