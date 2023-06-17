import interfases.CalculatableShape;
import interfases.Resizable;

public class Quad extends Variables implements CalculatableShape, Resizable {


    public Quad(int length, double[] coord) {
        this.length = length;
        this.coord = coord;
    }

    @Override
    public double calculateAria() {
        return length*length;
    }

    @Override
    public void resize(double scaleFactor) {
        length*=scaleFactor;
    }

    @Override
    public String getName() {
        return "Quad";
    }

    @Override
    public double[] getCoord() {
        return coord;
    }
}
