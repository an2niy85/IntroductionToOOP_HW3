package task2;

/**
 * Рабочий (работает с 9 до 18,
 * получает фиксированную плату
 */
public class Worker extends Employee{

    public Worker(String name, String surName, double salary, int age) {
        super(name, surName, salary, age);
    }

    @Override
    public double calculateSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return String.format("%s %s %d; Рабочий; Среднемесячная заработная плата: %.2f",
                surName, name, age, salary);
    }
}
