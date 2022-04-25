package com;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

class Seller {
    //Продавец
    private String name;
    private String productName;
    private int count;
    private double price;
    private LocalDate saleDate;

    public Seller(String name, String productName, int count, double price, LocalDate saleDate) {
        this.setName(name);
        this.setProductName(productName);
        this.setCount(count);
        this.setPrice(price);
        this.setSaleDate(saleDate);
    }

    public Seller() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {

        this.name = name.strip();

        for (int i = 0; i < this.name.length(); i++) {
            if (!Character.isAlphabetic(this.name.charAt(i)) || this.name.charAt(i) == '-') {
                return;
            }
        }
        String firstPart = this.name.substring(0, 1).toUpperCase();

        String lastPart = this.name.substring(1).toLowerCase(Locale.ROOT);
        this.name = firstPart + lastPart;

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
        if (count >= 0) {
            this.count = count;
        }
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price > 0) {
            this.price = price;
        }
    }

    public LocalDate getSaleDate() {
        return saleDate;
    }

    /**
     * Установка даты продажи с проверкой
     *
     * @param saleDate Устанавлиемая дата
     */
    public void setSaleDate(LocalDate saleDate) {
        if (saleDate.isAfter(LocalDate.now())) {
            this.saleDate = LocalDate.now();
        } else {
            this.saleDate = saleDate;
        }
    }

    @Override
    public String toString() {
        return "\tПродавец: " + getName() +
                "\n\tПродал: " + getProductName() +
                "\n\tКол-во: " + getCount() + "шт" +
                "\n\tСумма: " + getPrice() +
                "\n\tДата: " + getSaleDate().format(DateTimeFormatter.ISO_DATE) + "\n";
    }
}