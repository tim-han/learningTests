package com.springapp.mvc.pattern.visitor;

import org.junit.Test;

/**
 * @author tim.han@daumkakao.com
 */
public class VisitorDemo {

    @Test
    public void visitorDemo() {
        Car car = new Car();
        car.accept(new CarElementPrintVisitor());
        car.accept(new CarElementDoVisitor());
    }
}
