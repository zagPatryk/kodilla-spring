package com.kodilla.spring.portfolio;


import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BoardTestSuite {
    @Test
    public void testTaskAdd() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext(BoardConfig.class);
        Board board = context.getBean(Board.class);
        //When
        board.getToList().getTasks().add("Zadanie to");
        board.getInProgressList().getTasks().add("Zadanie inProgress");
        board.getDoneList().getTasks().add("Zadanie done");

        List<String> testTo = new ArrayList<>();
        testTo.add("Zadanie to");

        List<String> testInProgress = new ArrayList<>();
        testInProgress.add("Zadanie inProgress");

        List<String> testDone = new ArrayList<>();
        testDone.add("Zadanie done");

        //Then
        Arrays.stream(context.getBeanDefinitionNames()).forEach(System.out::println);
        Assert.assertEquals(testTo,board.getToList().getTasks());
        Assert.assertEquals(testInProgress,board.getInProgressList().getTasks());
        Assert.assertEquals(testDone,board.getDoneList().getTasks());
    }
}