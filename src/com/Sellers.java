package com;

import java.util.Arrays;

public class Sellers {
    private final Seller[] sellers;
    private int currentNumSeller;
    private int numProduct;
    private double maxPrice = 0;
    Seller maxPriceSeller=null;


    public Sellers(final int sellersNum) {
        this.sellers = new Seller[sellersNum];
        currentNumSeller=-1;
    }

    public void addSeller(Seller newSeller){
        if(++currentNumSeller<sellers.length){
            sellers[currentNumSeller]= newSeller;
        }
    }

    public Sellers findSellsByName(String name){

        Sellers tempSells=new Sellers(sellers.length);

        for (int i = 0; i < sellers.length; i++) {
            if (sellers[i].getName().equalsIgnoreCase(name)){
                numProduct+=sellers[i].getCount();
                tempSells.addSeller(sellers[i]);
                System.out.println(sellers[i]+"\n\n");
            }
        }
        System.out.println("Общее количество товаров проданые продавцом: "+ numProduct+"\n");

        return tempSells;
    }
    public Seller maxPriceProduct(String name){
        for (int i = 0; i < sellers.length; i++) {
            if (sellers[i].getName().equalsIgnoreCase(name)){
                if (sellers[i].getPrice() > maxPrice){
                    maxPrice = sellers[i].getPrice();
                    maxPriceSeller = sellers[i];
                }
            }
        }
        System.out.println("Самый дорогой товар : \n");
        return maxPriceSeller;
    }


    @Override
    public String toString() {
        return null;
    }
}
