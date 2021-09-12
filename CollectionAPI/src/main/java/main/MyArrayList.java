package main;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author HP
 */
public class MyArrayList {

    private String[] arr = new String[10];
    int addedElementLenght = 0;

    public void add(String element) {
        if (arr.length == addedElementLenght) {
            String[] arr2 = new String[arr.length / 2 + arr.length];
            for (int i = 0; i < arr.length; i++) {
                arr2[i] = arr[i];
            }

            arr = arr2;
        }
        arr[addedElementLenght++] = element;
    }

    public String get(int i) {
        return arr[i];
    }
}
