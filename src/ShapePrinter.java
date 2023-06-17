import interfases.Resizable;
import interfases.Shape;

import java.util.Arrays;

public class ShapePrinter {

    public void printShapeName(Shape shape){
        System.out.println("interfases.Shape`s name is " + shape.getName());
    }

    public void printCoordShape(Shape shape){
        System.out.println("interfases.Shape`s coordinates are " + Arrays.toString(shape.getCoord()));
    }

    public void resizeShape(Resizable shape, double scaleFactor){
        shape.resize(scaleFactor);
        System.out.println("New size of shape is " + shape.calculateAria());
    }
}
