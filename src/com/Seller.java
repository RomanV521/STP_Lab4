package com;

import java.util.Date;

class Seller {
    //Продавец
    private String name;
    private String productName;
    private int count;
    private double price;
    private Date saleDate;

    public Seller(String name,String productName, int count, double price, Date saleDate){
        this.name=name;
        this.productName=productName;
        this.count=count;
        this.price=price;
        this.saleDate=saleDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        if (count>=0){
            this.count = count;
        }
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price>0) {
            this.price = price;
        }
    }

    public Date getSaleDate() {
        return saleDate;
    }

    public void setSaleDate(Date saleDate) {
        this.saleDate = saleDate;
    }
}
