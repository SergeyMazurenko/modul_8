import interfases.Shape;

public class Point extends Variables implements Shape {

    public Point(double [] coord) {
        this.coord = coord;
    }

    @Override
    public String getName() {
        return "Point";
    }

    @Override
    public double[] getCoord() {
        return coord;
    }

}
