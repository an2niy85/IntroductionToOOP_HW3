package task2;

import java.util.Arrays;

public class Program {
    public static void main(String[] args) {
//        int a = 1;
//        String str = "aaa";
//
//        System.out.println(a);
//        System.out.println(str);

        //Worker worker = new Worker("Фамилия", "Имя", 300);
        Employee[] employees = EmployeeFabric.generateEmployees(15);
        for (Employee employee: employees) {
            if(employee instanceof Worker)
            System.out.println((Worker)employee);
            else System.out.println((Freelancer)employee);
        }

        System.out.println();
        System.out.println("***");
        System.out.println();

        Arrays.sort(employees, new SalaryComparator());

        for (Employee employee: employees) {
            if(employee instanceof Worker)
                System.out.println((Worker)employee);
            else System.out.println((Freelancer)employee);
        }

    }
}
