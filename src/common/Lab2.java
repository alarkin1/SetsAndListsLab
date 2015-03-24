/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package common;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author alarkin1
 */
public class Lab2 {

    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Smith", "Bob", "111-11-1111"));
        employees.add(new Employee("Smith", "Rick", "222-22-2222"));
        employees.add(new Employee("Green", "Rick", "333-33-3333"));

        for (Employee employee  : employees) {
            System.out.println(employee.toString());
        }
    }
}
