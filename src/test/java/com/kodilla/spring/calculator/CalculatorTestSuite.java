package com.kodilla.spring.calculator;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CalculatorTestSuite {
    @Test
    public void testAdd() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.calculator");
        Calculator calculator = context.getBean(Calculator.class);
        //When
        double addResult = calculator.add(2, 2);
        //Then
        Assert.assertEquals(4.00, addResult, 0.001);
    }

    @Test
    public void testSub() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.calculator");
        Calculator calculator = context.getBean(Calculator.class);
        //When
        double subResult = calculator.sub(2, 2);
        //Then
        Assert.assertEquals(0.00, subResult, 0.001);
    }

    @Test
    public void testMul() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.calculator");
        Calculator calculator = context.getBean(Calculator.class);
        //When
        double mulResult = calculator.mul(2, 2);
        //Then
        Assert.assertEquals(4.00, mulResult, 0.001);
    }

    @Test
    public void testDiv() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.calculator");
        Calculator calculator = context.getBean(Calculator.class);
        //When
        double divResult = calculator.div(2, 0);
        //Then
        Assert.assertEquals(Double.POSITIVE_INFINITY, divResult, 0.001);
    }
}