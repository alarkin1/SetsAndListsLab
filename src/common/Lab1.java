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
public class Lab1 {

    public static void main(String[] args) {
        List hobbyItems = new ArrayList();

        hobbyItems.add("Minecraft");
        hobbyItems.add("Cyber Security Practice");
        hobbyItems.add("Cyber Security Club");
        hobbyItems.add("Raspberry PI Club");

        for (Object hobbyItem : hobbyItems) {
            System.out.println((String)hobbyItem);

        }
        System.out.println("end1");
        hobbyItems.add(1, "More Minecraft!");
        hobbyItems.add(4, "More Cyber Security Club!");

        for (Object hobbyItem : hobbyItems) {
            System.out.println((String)hobbyItem);

        }
        System.out.println("end2");       
        hobbyItems.remove(5);

        for (Object hobbyItem : hobbyItems) {
            System.out.println((String)hobbyItem);
        }
        System.out.println("end3");
    }
}
