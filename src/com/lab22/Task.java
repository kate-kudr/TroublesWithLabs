package com.lab22;

import java.util.Date;

public class Task {
    private Date start;
    private Date finish;

    public void getStart(){
        Date start = new Date();
        System.out.println("received: " + start);
    }

    public void getFinish(){
        Date finish = new Date();
        System.out.println("completed: " + finish);
    }
}
