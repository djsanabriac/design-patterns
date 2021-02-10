package co.djsanabriac.creational.prototype;

import co.djsanabriac.creational.prototype.interfaces.Shape;
import co.djsanabriac.creational.prototype.shapes.Circle;
import co.djsanabriac.creational.prototype.shapes.Rectangle;
import co.djsanabriac.creational.prototype.shapes.Square;

import java.util.HashMap;
import java.util.Map;

public class ShapeCache {

    private static Map<String, Shape> shapeMap =  new HashMap<>();

    public static Shape getShape(String shapeType){
        Shape s = shapeMap.get(shapeType);
        return (Shape) s.clone();
    }

    public static void loadCache(){

        Circle circle = new Circle();
        circle.setId("1");
        shapeMap.put(circle.getId(),circle);

        Square square = new Square();
        square.setId("2");
        shapeMap.put(square.getId(),square);

        Rectangle rectangle = new Rectangle();
        rectangle.setId("3");
        shapeMap.put(rectangle.getId(), rectangle);

    }

}
