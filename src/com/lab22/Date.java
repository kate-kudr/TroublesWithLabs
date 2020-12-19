package com.lab22;

public class Date {
    private final String date;
    private String hour;
    private String min;

    public Date(String date) {
        this.date=date;
        time();
    }

    @Override
    public String toString() {
        return "Date {" +
                "hour = '" + hour + '\'' +
                ", min = '" + min + '\'' +
                '}';
    }

    public void time(){
        String[] str = date.split(">");
        hour = str[0].substring(1);
        min = str[1].substring(1);
    }
}
