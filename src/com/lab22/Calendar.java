package com.lab22;

public class Calendar {
    private final String calendar;
    private String day;
    private String month;
    private String year;

    public Calendar(String calendar) {
        this.calendar = calendar;
        calendar();
    }

    public void calendar(){
        String[] str = calendar.split(">");
        day = str[0].substring(1);
        month = str[1].substring(1);
        year = str[2].substring(1);
    }

    @Override
    public String toString() {
        return "Calendar {" +
                "day = '" + day + '\'' +
                ", month = '" + month + '\'' +
                ", year = '" + year + '\'' +
                '}';
    }
}
