package com.lab7;

public class FurnitureTest {
    public static void main(String[] args) {
        Table table = new Table("wooden", "brown", 80, true, false);
        Chair chair = new Chair("iron", "grey", 60, false, true, false);
        Wardrobe wardrobe = new Wardrobe("wooden", "black", 2, true, true, true);
        System.out.println(table);
        table.furnitureBuild();
        table.setItem("pen");
        table.putOnTheTable();
        System.out.println(chair);
        chair.furnitureRepair();
        System.out.println(wardrobe);
        wardrobe.openTheDoor();
    }
}
