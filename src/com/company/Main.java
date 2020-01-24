package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(50);
        numbers.add(10);
        numbers.add(30);
        numbers.add(20);
        numbers.add(40);
        for (int i = 0; i <numbers.size(); i++) {
            System.out.println(numbers.get(i));

        }
        System.out.println();
        ArrayList<Integer> copyNumbers = new ArrayList<>(numbers);
        for (int i = 0; i <copyNumbers.size(); i++) {
            System.out.println(copyNumbers.get(i));
        }
    }
}