package ru.sukhoruchkina.list;

public class ArrayList {
    private static final int DEFAULT_CAPACITY = 10;
    private Object[] elements;
    private int size;
    private int lastFreeIndex;

    public ArrayList() {
        size = DEFAULT_CAPACITY;
        elements = new Object[size];
        lastFreeIndex = 0;
    }

    public void add(Object element)//метод добавляет элемент в список
    {
        if (lastFreeIndex == size) {
            grow();
        }

        elements[lastFreeIndex] = element;
        lastFreeIndex++;
    }

    public Object get(int i) //Метод возвращает элемент из списка
    {
        if (!checkBounds(i)) {
            return null;
        }
        checkBounds(i);
        return elements[i];
    }

    public Object remove(int i) //Метод удаляет элемент по индексу
    {
        if (!checkBounds(i)) {
            return null;
        }
        Object elementToReturn = elements[i];
        moveElements(i);
        lastFreeIndex--;
        return elementToReturn;
    }

    public int size()//Метод возвращает текущее количество элементов в списке
     {
        return lastFreeIndex;//Количество элементов в списке

    }

    private boolean checkBounds(int i) {
        if (i < 0 || i >= lastFreeIndex) {
            System.out.printf("Индекс %d за границами размера %d%n", i, lastFreeIndex);
            return false;
        }
        return true;
    }

    private void grow()
    {
        size = size * 2;
        Object[] tempArray = new Object[size];
        System.arraycopy(elements, 0, tempArray, 0, elements.length);
        elements = tempArray;
    }

    private void moveElements(int position) {
        int lastIndex = 0;
        for (int i = position; i + 1 < size && elements[i] != null; i++) {
            elements[i] = elements[i + 1];
            lastIndex = i + 1;
        }
        elements[lastIndex] = null;
    }

    @Override
    public String toString() {
        if (lastFreeIndex == 0) {
            return "{}";
        }

        String result = "[";
        for (int i = 0; i < lastFreeIndex; i++) {
            result += elements[i] + ", ";
        }

        result = result.substring(0, result.length() - 2);
        result += "]";
        return result;
    }
}
