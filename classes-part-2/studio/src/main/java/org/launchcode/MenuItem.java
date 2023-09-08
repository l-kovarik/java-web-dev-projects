package org.launchcode;

public class MenuItem {
    private double price;
    private String name;
    private String description;
    private String category;
    private String date;

    // Getters and setters

    public MenuItem(double price, String name, String description, String category, String date) {
        this.price = price;
        this.name = name;
        this.description = description;
        this.category = category;
        this.date = date;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
}