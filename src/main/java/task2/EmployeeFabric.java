package task2;

import java.util.Random;

public class EmployeeFabric {
    private static Random random = new Random();
    public static Worker generateWorker(){
        String[] names = new String[] { "Анатолий", "Глеб", "Клим", "Мартин", "Лазарь", "Владлен", "Клим", "Панкратий", "Рубен", "Герман" };
        String[] surnames = new String[] { "Григорьев", "Фокин", "Шестаков", "Хохлов", "Шубин", "Бирюков", "Копылов", "Горбунов", "Лыткин", "Соколов" };
        int[] ages = { 30, 35, 40, 25, 27, 32, 36, 39, 23, 38 };

        int salary = random.nextInt(60000, 120001);
        return new Worker(
                surnames[random.nextInt(surnames.length)],
                names[random.nextInt(names.length)],
                salary,
                ages[random.nextInt(ages.length)]
        );
    }

    public static Freelancer generateFreelancer(){
        String[] names = new String[] { "Анатолий", "Глеб", "Клим", "Мартин", "Лазарь", "Владлен", "Клим", "Панкратий", "Рубен", "Герман" };
        String[] surnames = new String[] { "Григорьев", "Фокин", "Шестаков", "Хохлов", "Шубин", "Бирюков", "Копылов", "Горбунов", "Лыткин", "Соколов" };
        int[] ages = { 30, 35, 40, 25, 27, 32, 36, 39, 23, 38 };

        double hourlyRate = random.nextDouble(600, 1201);
        return new Freelancer(
                surnames[random.nextInt(surnames.length)],
                names[random.nextInt(names.length)],
                hourlyRate,
                ages[random.nextInt(ages.length)]
        );
    }

    /**
     * TODO: Переработать метод generateEmployees, метод должен генерировать рабочих
     * разных типов (Worker, Freelancer) в рамках домашнего
     * @param count
     * @return
     */
    public static Employee[] generateEmployees(int count){
        Employee[] employees = new Employee[count];
        Random rnd = new Random();
        for (int i = 0; i < count; i++) {
            if (rnd.nextInt(2) == 0) {
                employees[i] = generateWorker();
            } else {
                employees[i] = generateFreelancer();
            }
        }
        return employees;
    }
}
