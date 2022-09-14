package com.example.cw5;

public class Fruits {
    private String fruitName;
    private double fruitPrice;
    private int fruitImg;

    public Fruits(String fruitName, double fruitPrice, int fruitImg) {
        this.fruitName = fruitName;
        this.fruitPrice = fruitPrice;
        this.fruitImg = fruitImg;
    }

    public String getFruitName() {
        return fruitName;
    }

    public void setFruitName(String fruitName) {
        this.fruitName = fruitName;
    }

    public double getFruitPrice() {
        return fruitPrice;
    }

    public void setFruitPrice(double fruitPrice) {
        this.fruitPrice = fruitPrice;
    }

    public int getFruitImg() {
        return fruitImg;
    }

    public void setFruitImg(int fruitImg) {
        this.fruitImg = fruitImg;
    }
}
