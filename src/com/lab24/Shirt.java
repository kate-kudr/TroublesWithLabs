package com.lab24;

public class Shirt {
    private String id, description, color, size;

    public Shirt() {
    }

    public Shirt(String id, String description, String color, String size) {
        this.id = id;
        this.description = description;
        this.color = color;
        this.size = size;
    }

    public Shirt makeShirtOutOfString(String shirtDescription) {
        String[] shirtDescriptionArray = shirtDescription.split(",");

        setId(shirtDescriptionArray[0]);
        setDescription(shirtDescriptionArray[1]);
        setColor(shirtDescriptionArray[2]);
        setSize(shirtDescriptionArray[3]);

        return this;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "\nShirt{" +
                "id: '" + id + '\'' +
                ",\n description: '" + description + '\'' +
                ",\n color: '" + color + '\'' +
                ",\n size: '" + size + '\'' +
                '}';
    }
}

