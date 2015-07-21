package com.springapp.mvc.pattern.visitor;

/**
 * @author tim.han@daumkakao.com
 */
public class Wheel implements CarElement {
    private String name;

    public Wheel (String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    @Override
    public void accept(CarElementVisitor visitor) {
        visitor.visit(this);
    }
}
