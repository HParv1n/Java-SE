/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.LinkedList;

/**
 *
 * @author HP
 */
public class Main {
    public static void main(String[] args) {
        LinkedList<String> l = new LinkedList<>();
        l.add("Messi");
        l.add("Ronaldo");
        l.add("Xavi");
        l.add("Iniesta");
        l.add("David Villa");

        l.size();
        System.out.println("size="+l.size());
        for(int i = 0;i<l.size();i++){
            System.out.println(l.get(i));
        }
    }
}
