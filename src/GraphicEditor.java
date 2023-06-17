public class GraphicEditor {
    public static void main(String[] args) {
        Circle c1 = new Circle(4,new double[]{2,6});
        Quad q1 = new Quad(23,new double[]{1,4});
        Triangle t1 = new Triangle(6,8,new double[]{8,4});
        Point p1 = new Point(new double[]{1,0});
        Line l1 = new Line(new double[]{4,6});
        ShapePrinter printer = new ShapePrinter();

//        Example
        printer.printShapeName(t1);
        printer.printCoordShape(l1);
        printer.resizeShape(c1, 2);


    }
}
