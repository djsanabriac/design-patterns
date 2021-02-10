package co.djsanabriac.creational.prototype.shapes;

import co.djsanabriac.creational.prototype.interfaces.Shape;

public class Circle extends Shape {

    public Circle(){
        type = "Circle";
    }

    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
