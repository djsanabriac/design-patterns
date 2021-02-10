package co.djsanabriac.creational.prototype.shapes;

import co.djsanabriac.creational.prototype.interfaces.Shape;

public class Square extends Shape {

    public Square(){
        type = "Square";
    }

    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
