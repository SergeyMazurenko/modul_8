import interfases.Shape;

public class Line extends  Variables implements Shape {

    public Line(double [] coord) {
        this.coord = coord;
    }
    @Override
    public String getName() {
        return null;
    }

    @Override
    public double[] getCoord() {
        return coord;
    }

}
