package figury;

import java.util.ArrayList;

public class Program {
    public static void main(String[] args) {
        Square sq1 = new Square(3.5);
        Cuboid cu1 = new Cuboid(3.5);
        sq1.showArea();
        cu1.showArea();
        Circle ci1 = new Circle(5.6);
        Cylinder cy1 = new Cylinder(6.7, 5.5);
        //Shape sh1 = new Shape();
        ArrayList<Shape>  figury = new ArrayList<Shape>();
        figury.add(sq1);
        figury.add(cu1);
        figury.add(ci1);
        figury.add(cy1);
        for(Shape figura : figury)
            figura.showArea();
        Square sześcian1 = new Cuboid(3.6);
    }
}
