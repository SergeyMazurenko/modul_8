import interfases.CalculatableShape;
import interfases.Resizable;

public class Triangle extends Variables implements CalculatableShape, Resizable {

    public Triangle(double side, double heigth, double[] coord) {
        this.side = side;
        this.heigth = heigth;
        this.coord = coord;
    }

    @Override
    public double calculateAria() {
        return side*heigth/2;
    }

    @Override
    public void resize(double scaleFactor) {
        side*=scaleFactor;
        heigth*=heigth;
    }

    @Override
    public String getName() {
        return "Triangle";
    }

    @Override
    public double[] getCoord() {
        return coord;
    }
}
