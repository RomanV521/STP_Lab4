package com;


import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Objects;
import java.util.Random;

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

        Seller seller1 = new Seller("Иванов", "Яблоко", 3, 20.5, LocalDate.of(2021, 3, 23));
        Seller seller2 = new Seller("Иванов", "Хлеб", 5, 24.5, LocalDate.of(2022, 1, 6));
        Seller seller3 = new Seller("Петров", "Морковь", 6, 19.3, LocalDate.of(2021, 9, 3));
        double maxPrice = 0;
        int numProduct = 0;

        Seller[] sellers = new Seller[3];
        sellers[0] = seller1;
        sellers[1] = seller2;
        sellers[2] = seller3;

        Seller maxPriceSeller = new Seller();
        for (int i = 0; i < sellers.length; i++) {
            if (sellers[i].getName().equalsIgnoreCase("Иванов")) {
                if (sellers[i].getPrice() > maxPrice) {
                    maxPrice = sellers[i].getPrice();
                    maxPriceSeller = sellers[i];
                }
                numProduct += sellers[i].getCount();
                System.out.println(sellers[i]);
            }
        }
        System.out.println("Общее количество товаров проданые продавцом: "+ numProduct+"\n");
        System.out.println("Самый дорогой товар : \n"+ maxPriceSeller);
    }

    /**
     * Поля класса   |                  Задача
     * --------------|------------------------------------------
     * Фамилия       |Вывести данные о самом молодом сотруднике.
     * Имя           |
     * Отчество      |
     * Должность     |
     * Зарплата      |
     * Дата рождения |
     */
    private static void task2() {
        System.out.println("\n\nTask 2:\nВывести данные о самом молодом сотруднике.\n");

        Young collaborator1 = new Young("НикоЛай", "Петров", "Карлович", "секретарь", 214.12, LocalDate.of(1999, 1, 10));
        Young collaborator2 = new Young("Михаил", "Иванов", "Иванович", "менеджер", 235.92, LocalDate.of(1990, 3, 6));
        Young collaborator3 = new Young("Александр", "Соколов", "Ярославович", "администратор", 184.90, LocalDate.of(1993, 1, 15));
        Young collaborator4 = new Young("Иван", "Волков", "Николаевич", "директор", 1414.87, LocalDate.of(1987, 9, 21));

        Young[] collaborators = new Young[4];
        collaborators[0] = collaborator1;
        collaborators[1] = collaborator2;
        collaborators[2] = collaborator3;
        collaborators[3] = collaborator4;

        int pos = 0;
        Young youngWorker;
        LocalDate minDate=collaborators[0].getDateOfBirth();

        for (int i = 0; i < collaborators.length; i++) {
            if (collaborators[i].getDateOfBirth().isAfter(minDate)){
                minDate = collaborators[i].getDateOfBirth();
                pos=i;
            }
        }
        youngWorker = collaborators[pos];

        System.out.println(youngWorker+"\n\n");
//        System.out.println("Самы молодой сотрудник:\n" + collaborators[pos].getSurname() + " " + collaborators[pos].getName() + " " + collaborators[pos].getOtchestvo() + " \nЗанимающий должность: " + collaborators[pos].getPosition() + "\nИмеющий зарплату: " + collaborators[pos].getMoneySalary() + "\nРожденный: " + collaborators[pos].getDateOfBirth());
    }

    public static void main(String[] args) {
        Start();
        task1();
        task2();
    }
}