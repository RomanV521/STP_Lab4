package com;


import java.util.*;

/**
 * Vykhodets Roman, #1
 */
public class Main {
    static Random random = new Random();

    private static void Start() {
        System.out.println("\nCompleted by student AT-212 \nOdessa Polytechnic University \nVykhodets Roman \n\nVariant 1 \n\n");
    }

    /**
     * Поля класса  |                   Задача
     * -------------|------------------------------------------------
     * Продавец     |   Определить количество товаров, проданных
     * Наименование |   продавцом «Иванов», вывести сведения о них и
     * Количество   |   определить товар с максимальной стоимостью.
     * Цена         |
     * Дата продажи |
     */
    private static void task1() {
        System.out.println("Task 1:\nОпределить количество товаров, проданных продавцом «Иванов», вывести сведения о них и определить товар с максимальной стоимостью.\n");

        Seller seller1 = new Seller("Иванов","Яблоко",3,20.5,new Date(2021,3,23));
        Seller seller2 = new Seller("Иванов","Хлеб",5,24.5,new Date(2022,1,6));
        Seller seller3 = new Seller("Петров", "Морковь",6,19.3,new Date(2021,9,3));

        Seller[] sellers = new Seller[3];
        sellers[0] = seller1;
        sellers[1] = seller2;
        sellers[2] = seller3;

        //сведенья о товарах проданных Иванову + количество всех товаров Иванова
        int productCount = 0;
        for (Seller seller : sellers) {
            if (Objects.equals(seller.getName(), "Иванов")) {
                productCount = productCount + seller.getCount();
                //System.out.println(seller);
            }
        }

        System.out.println("Количество всех товаров продавца Иванов: " + productCount);
        //максимальная стоимость товара у Иванова
        double max = 0;
        Seller maxPriceSeller = new Seller();
        for (Seller seller : sellers) {
            if (Objects.equals(seller.getName(), "Иванов") && seller.getPrice() > max) {
                max = seller.getPrice();
                maxPriceSeller = seller;
            }
        }

        System.out.println("Товар с максимальной стоимостью с именем " + maxPriceSeller.getName() + " Товар - " + maxPriceSeller.getProductName() + " Цена - " + maxPriceSeller.getPrice());
    }

    /**
     *  Поля класса   |                  Задача
     * ---------------|------------------------------------------
     *  Фамилия       |Вывести данные о самом молодом сотруднике.
     *  Имя           |
     *  Отчество      |
     *  Должность     |
     *  Зарплата      |
     *  Дата рождения |
     */
    private static void task2(){

    }


    public static void main(String[] args) {
	    Start();
        task1();
    }
}

