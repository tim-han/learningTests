package com.springapp.mvc.pattern.visitor;

/**
 * @author tim.han@daumkakao.com
 */
public interface CarElement {
    void accept(CarElementVisitor visitor);
}
