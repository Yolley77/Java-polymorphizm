
package pract3;

public class Circle extends Shape {
    protected double radius;
    Circle() {}
    Circle(double radius) {
        this.radius = radius;
    }
    Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }
    
    public void setRadius(double r) {
        radius = r;
    }
    
    public double getRadius() {
        return radius;
    }

    @Override
    public double getArea() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return 2 * 3.14f * radius;
    }

    @Override
    public double getSquare() {
        return 3.14f * radius * radius;
    }

    @Override
    public String toString() {
        return "Area - " ;
    }
    
    
}
