package com.springapp.mvc.pattern.visitor;

/**
 * @author tim.han@daumkakao.com
 */
public class Car implements CarElement {
    CarElement[] elements;

    public CarElement[] getElements() {
        return this.elements.clone();
    }

    public Car() {
        this.elements = new CarElement[]
            {
                new Wheel("front left"), new Wheel("front right"),
                new Wheel("back left"), new Wheel("back right"),
                new Body(), new Engine()
            };
    }

    @Override
    public void accept(CarElementVisitor visitor) {
        for(CarElement element : this.getElements()) {
            element.accept(visitor);
        }
        visitor.visit(this);
    }
}
