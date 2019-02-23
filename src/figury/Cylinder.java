package figury;

public class Cylinder extends Circle {
    private double height;
    public Cylinder(double r, double h) {
        super(r);
        this.height = h;
    }
    public double getArea() {
        double pole = super.getArea()*2 + 2 * Math.PI * height * getRadius();
        return pole;
    }
}
