package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> listA = new ArrayList<>();

        System.out.println("Enter 5 strings for list A:");
        for (int i = 0; i < 5; i++) {
            String input = scanner.nextLine();
            listA.add(input);
        }

        System.out.println("list A:");
        for (String str : listA) {
            System.out.println(str);
        }

        List<String> listB = new ArrayList<>();
        System.out.println("Enter 5 strings for list B:");
        for (int i = 0; i < 5; i++) {
            listB.add(scanner.nextLine());
        }
        System.out.println("List B:");
        for (String str : listB) {
            System.out.println(str);
        }

        List<String> listC = new ArrayList<>();
        Collections.reverse(listB);
        int indexA = 0;
        int indexB = 0;
        while (indexA < listA.size() || indexB < listB.size()) {
            if (indexA < listA.size()) {
                listC.add(listA.get(indexA));
                indexA++;
            }
            if (indexB < listB.size()) {
                listC.add(listB.get(indexB));
                indexB++;
            }
            System.out.println("List C (Collected):");
            for (String str : listC) {
                System.out.println(str);
            }

            Collections.sort(listC, Comparator.comparingInt(String::length));
            System.out.println("Sorted List C:");
            for (String str : listC) {
                System.out.println(str);

            }
        }
    }
}