package com.springapp.mvc.pattern.visitor;

/**
 * @author tim.han@daumkakao.com
 */
public class Engine implements CarElement {
    @Override
    public void accept(CarElementVisitor visitor) {
        visitor.visit(this);
    }
}
