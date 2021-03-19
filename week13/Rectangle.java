package week13;

public class Rectangle extends Shape {
private double width, length; 
public Rectangle() {
  
    this.width = 1;
    this.length = 1;
}
public Rectangle(double widthh, double lengthh) {
    this.width = widthh;
    this.length = lengthh;
}

public double getArea() {
    return width * length;
}

} 