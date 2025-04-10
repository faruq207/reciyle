package com.example.reciyle;

public class Makanan {
    private String name;
    private float rating;
    private String price;
    private String from;
    private int imageResId;

    public Makanan(String name, float rating, String price, String from, int imageResId) {
        this.name = name;
        this.rating = rating;
        this.price = price;
        this.from = from;
        this.imageResId = imageResId;
    }

    public String getName() { return name; }
    public float getRating() { return rating; }
    public String getPrice() { return price; }
    public String getFrom() { return from; }
    public int getImageResId() { return imageResId; }
}