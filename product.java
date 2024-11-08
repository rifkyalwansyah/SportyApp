package com.as.aboutsporty;

public class Product {
    private String name;
    private String price;
    private int imageResource;

    // Konstruktor
    public Product(String name, String price, int imageResource) {
        this.name = name;
        this.price = price;
        this.imageResource = imageResource;
    }

    public Product(String name) {
    }

    // Getter untuk mendapatkan nilai properti
    public String getName() {
        return name;
    }

    public String getPrice() {
        return price;
    }

    public int getImageResource() {
        return imageResource;
    }

    // Setter jika Anda butuh mengubah nilai properti
    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public void setImageResource(int imageResource) {
        this.imageResource = imageResource;
    }
}
