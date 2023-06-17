import interfases.CalculatableShape;
import interfases.Resizable;

public class Circle extends Variables implements CalculatableShape, Resizable {

    public Circle(double radius, double [] coord){
        this.radius = radius;
        this.coord = coord;

    }
    @Override
    public double calculateAria() {
        return Math.PI*radius*radius;
    }

    @Override
    public void resize(double scaleFactor) {
        radius*=scaleFactor;
    }

    @Override
    public String getName() {
        return "Circle";
    }

    @Override
    public double [] getCoord() {
        return coord;
    }
}
