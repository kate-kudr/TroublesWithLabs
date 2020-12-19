package com.lab19;

public class Client {
    String name;
    String TIN;

    public Client(String name, String TIN) {
        this.name = name;
        this.TIN = TIN;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTIN() {
        return TIN;
    }

    public void setTIN(String TIN) {
        this.TIN = TIN;
    }
}
