package task2;

import java.util.Comparator;

public class SalaryComparator implements Comparator<Employee> {
    @Override
    public int compare(Employee o1, Employee o2) {
        //return Double.compare(o1.calculateSalary(), o2.calculateSalary()); // - от мин к макс
        //return Double.compare(o2.calculateSalary(), o1.calculateSalary()); - от макс к мин
        return Double.compare(o1.age, o2.age); // - от мин к макс
        /*if (o1.calculateSalary() > o2.calculateSalary())
            return 1;
        else if (o1.calculateSalary() == o2.calculateSalary()) {
            return 0;
        }
        else {
            return -1;
        }*/
    }
}
