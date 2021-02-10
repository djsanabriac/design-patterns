package co.djsanabriac.creational.prototype;

import co.djsanabriac.creational.prototype.interfaces.Shape;

public class PrototypePatternDemo {

    public static void main(String[] args) {

        ShapeCache.loadCache();

        Shape s1 = (Shape) ShapeCache.getShape("1");
        s1.draw();

        Shape s2 = (Shape) ShapeCache.getShape("2");
        s2.draw();

        Shape s3 = (Shape) ShapeCache.getShape("3");
        s3.draw();

    }

}
