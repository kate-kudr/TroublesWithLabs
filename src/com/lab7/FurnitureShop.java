package com.lab7;

public class FurnitureShop {
    Furniture furniture;
    private int discount;
    private boolean warranty, blackFriday;

    public boolean isWarranty() {
        return warranty;
    }

    public void setWarranty(boolean warranty, Furniture furniture) {
        this.warranty = warranty;
    }

    public int getDiscount() {
        return discount;
    }

    public void setSale(int sale, Furniture furniture) {
        this.discount = sale;
    }

    public boolean isBlackFriday() {
        return blackFriday;
    }

    public void setBlackFriday(boolean blackFriday, Furniture furniture) {
        this.blackFriday = blackFriday;
    }

    public void warrantyRepair(Furniture furniture) {
        System.out.println("You have applied for warranty repairs");
        if (warranty)
            furniture.furnitureRepair();
    }

    public double calculateSale(Furniture furniture) {
        return furniture.getPrice() - furniture.getPrice() / 100 * discount;
    }

    public void blackFriday(Furniture furniture) {
        if (blackFriday) {
            System.out.println("Great! Now the price is " + calculateSale(furniture));
        } else System.out.println("There is no discount");
    }

    public static void main(String[] args) {
        Table table = new Table("wooden", "brown", 80, true, false);
        Chair chair = new Chair("iron", "grey", 60, false, true, false);
        Wardrobe wardrobe = new Wardrobe("wooden", "black", 2, true, true, true);
        FurnitureShop shop = new FurnitureShop();
        table.setPrice(table.getHeight());
        System.out.println(table);
        shop.setWarranty(true, table);
        shop.warrantyRepair(table);
        chair.setPrice(chair.getHeight());
        System.out.println(chair);
        shop.blackFriday(chair);
        shop.setWarranty(true, chair);
        shop.warrantyRepair(chair);
        wardrobe.setPrice(wardrobe.getHeight());
        System.out.println(wardrobe);
        shop.setSale(20, wardrobe);
        shop.setBlackFriday(true,wardrobe);
        shop.blackFriday(wardrobe);
    }
}
