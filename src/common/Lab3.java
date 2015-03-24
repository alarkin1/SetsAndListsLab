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
public class Lab3 {
    public static void main(String[] args) {
        List livingThings = new ArrayList();
        livingThings.add(new Employee("Smith", "Bob", "111-11-1111"));
        livingThings.add(new Employee("Smith", "Rick", "222-22-2222"));
        livingThings.add(new Employee("Green", "Rick", "333-33-3333"));
        livingThings.add(new Dog("Bill", 112256));
        
        for (Object livingThing : livingThings) {
            System.out.println(livingThing.toString());
        }
    }
}
