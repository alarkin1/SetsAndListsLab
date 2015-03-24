/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package common;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 *
 * @author alarkin1
 */
public class Lab4 {
    public static void main(String[] args) {
        List<Employee> listOfEmployees = new ArrayList<>();
        listOfEmployees.add(new Employee("Smith", "Bob", "111-11-1111"));
        listOfEmployees.add(new Employee("Smith", "Rick", "222-22-2222"));
        listOfEmployees.add(new Employee("Green", "Rick", "333-33-3333"));
        listOfEmployees.add(new Employee("Smith", "Bob", "111-11-1111"));
        listOfEmployees.add(new Employee("Smith", "Bob", "111-11-1111"));
        listOfEmployees.add(new Employee("Smith", "Rick", "222-22-2222"));
        
        
        for (Employee employee  : listOfEmployees) {
            System.out.println(employee.toString());
        }
        
        System.out.println("end1");
        
        Set<Employee> setOfEmployees = new HashSet(listOfEmployees);
        
        List<Employee> noDuplicateListOfEmployees = new ArrayList<>(setOfEmployees);
        
        for (Employee employee  : noDuplicateListOfEmployees) {
            System.out.println(employee.toString());
        }
        
        System.out.println("end2");
        
        }
}
