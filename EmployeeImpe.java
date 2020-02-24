package Kindergarten.Implement;

import Kindergarten.Employee;
import Kindergarten.Interface.Employee1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class EmployeeImpe implements Employee1 {
    private List<Employee> employees = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);

    @Override
    public void Employee() {
        System.out.println(" First Name ");
        String firstname = sc.next();
        System.out.println(" Last Name ");
        String lastname = sc.next();
        System.out.println(" Employee ");
        sc = new Scanner(System.in);
        String employee = sc.nextLine();
        System.out.println(" Unversity");
        sc = new Scanner(System.in);
        String unversity = sc.nextLine();
        System.out.println(" Year ");
        String year = sc.next();
        Employee employee1 = new Employee(firstname, lastname, employee, unversity, year);
        employees.add(employee1);
    }

    @Override
    public void AllEmployee() {
        for (int i = 0; i < employees.size(); i++) {
            System.out.println(employees.get(i));
        }

    }

    @Override
    public void sortEmployee() {
        Collections.sort(employees);
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

}
