package com.springapp.mvc.pattern.visitor;

/**
 * @author tim.han@daumkakao.com
 */
public interface CarElementVisitor {
    void visit(Wheel wheel);
    void visit(Engine engine);
    void visit(Body body);
    void visit(Car car);
}
