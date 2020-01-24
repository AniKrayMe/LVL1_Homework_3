package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Green");
        colors.add("Yellow");
        colors.add("Red");
        colors.add("Black");
        colors.add("Orange");
        for (int i = 0; i < colors.size(); i++) {
            System.out.println(colors.get(i));
        }
        System.out.println();
        colors.remove(2);
        for (int i = 0; i < colors.size(); i++) {
            System.out.println(colors.get(i));
        }

    }
}