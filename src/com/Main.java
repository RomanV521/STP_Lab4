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
        double maxPrice=0;
        int numProduct=0;
        String valueMaxPrice = "";

        Seller[] sellers = new Seller[3];
        sellers[0]=seller1;
        sellers[1]=seller2;
        sellers[2]=seller3;

        for (int i=0; i<sellers.length; i++){
            if (Objects.equals(sellers[i].getName(), "Иванов")) {
                if (sellers[i].getPrice() > maxPrice) {
                    maxPrice = sellers[i].getPrice();
                    valueMaxPrice = String.valueOf(sellers[i].getProductName() + "\nКол-во: " + sellers[i].getCount() + "шт \nСумма: " + sellers[i].getPrice() + " \nДата: " + sellers[i].getSaleDate());
                }
                numProduct++;
            }
        }
        System.out.println("Продавец Иванов продал: "+numProduct+" товара.\nСамый дорогой товар:"+valueMaxPrice);
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
        System.out.println("\n\nTask 2:\nВывести данные о самом молодом сотруднике.\n");

        Young collaborator1 =new Young("Коля", "Петров", "Карлович", "секретарь", 214.12, new Date(1994,5,13));
        Young collaborator2 =new Young("Миша", "Иванов", "Иванович", "менеджер", 235.92, new Date(1987,3,6));
        Young collaborator3 =new Young("Саша", "Соколов", "Ярославович", "администратор", 184.90, new Date(1999,1,15));
        Young collaborator4 =new Young("Ваня", "Волков", "Николаевич", "директор", 1414.87, new Date(1989,9,21));

        Young[]collaborators = new Young[4];
        collaborators[0]=collaborator1;
        collaborators[1]=collaborator2;
        collaborators[2]=collaborator3;
        collaborators[3]=collaborator4;
        Date minDOB= new Date(2022,12,30);
        int pos=0;

        for (int i=0; i<collaborators.length; i++){
            if (minDOB.before(collaborators[i].getDateOfBirth())){
                minDOB=collaborators[i].getDateOfBirth();
                pos=i;
            }
        }
        System.out.println("Самы молодой сотрудник:\n"+collaborators[pos].getSurname()+" "+collaborators[pos].getName()+" "+collaborators[pos].getOtchestvo()+" \nЗанимающий должность:"+collaborators[pos].getPosition()+"\nИмеющий зарплату:"+collaborators[pos].getMoneySalary()+"\nРожденный:"+collaborators[pos].getDateOfBirth());
    }



    public static void main(String[] args) {
	    Start();
        task1();
        task2();
    }
}

