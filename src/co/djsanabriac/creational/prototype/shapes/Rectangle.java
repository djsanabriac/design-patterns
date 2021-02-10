package co.djsanabriac.creational.prototype.shapes;

import co.djsanabriac.creational.prototype.interfaces.Shape;

public class Rectangle extends Shape {

    public Rectangle(){
        type = "Rectangle";
    }

    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}
