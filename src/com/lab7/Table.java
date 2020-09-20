package com.lab7;

public class Table extends Furniture {
    private String item;

    public Table(String material, String color, double height, boolean condition, boolean build) {
        super(material, color, height, condition, build);
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public void putOnTheTable(){
        if (getItem()!="None")
            System.out.println(item + " on the table");
        else System.out.println("There is no item");
    }

    @Override
    public void setPrice(double height) {
        if (height < 40)
            price = 1000;
        else if (height > 100)
            price = 3000;
        else price = 2000;
    }

    @Override
    public String toString() {
        return "Table" + super.toString() + '}';
    }
}
