package com.kodilla.spring.portfolio;

public class Board {
    private TaskList toList;
    private TaskList inProgressList;
    private TaskList doneList;

    public Board(TaskList toList, TaskList inProgressList, TaskList doneList) {
        this.toList = toList;
        this.inProgressList = inProgressList;
        this.doneList = doneList;
    }

    public TaskList getToList() {
        return toList;
    }

    public TaskList getInProgressList() {
        return inProgressList;
    }

    public TaskList getDoneList() {
        return doneList;
    }

    @Override
    public String toString() {
        return "Board{" +
                "toList=" + toList +
                ", inProgressList=" + inProgressList +
                ", doneList=" + doneList +
                '}';
    }
}
