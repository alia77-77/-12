package ru.sukhoruchkina;

import ru.sukhoruchkina.list.ArrayList;

public class Solution {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();

        System.out.println("Список после создания: " + list);

        for (int i = 0; i < 9; i++) {
            list.add(i);
        }

        System.out.println("\n");
        System.out.println("Список после добавления: " + list);
        System.out.println("Текущий размер: " + list.size());

        System.out.println("\n");
        int remove = (int) list.remove(2);
        System.out.println("Удаленный элемент: " + remove);
        int number = (int) list.get(2);
        System.out.println("Элемент с индексом 2: " + number);

        System.out.println("Список после удаления: " + list);

        System.out.println("\n");

        Object obj = list.get(12);
        if (obj != null) {
            int num1 = (int) obj;
        }

        Object remove2 = list.remove(17);
        if (remove2 != null) {
            int num1 = (int) remove2;
        }

        for (int i = 20; i < 35; i++) {
            list.add(i);
        }

        System.out.println("\n");
        System.out.println("Список после добавления: " + list);
        System.out.println("Текущий размер: " + list.size());
    }
}
