package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Integer> numbers1 = new ArrayList<>();
        numbers1.add(50);
        numbers1.add(10);
        numbers1.add(30);
        numbers1.add(20);
        numbers1.add(40);
        if (numbers1.size() == 0){
            System.out.println("array list is empty");
        }else {
            for (int i = 0; i <numbers1.size(); i++) {
                System.out.print(numbers1.get(i)+ ", ");

            }
        }
    }
}