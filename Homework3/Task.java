/* 1. Реализовать алгоритм обратной сортировки списков компаратором.
2. Пусть дан произвольный список целых чисел, удалить из него чётные числа
3. Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка.
4. Дано два целочисленных списка, объеденить их не допуская элементы второго списка уже встречающиеся в первом.
5. Создать ArrayList<Integer> и добавить нулевым эллементом ноль 10000 раз.
6. Повторить пятый пункт но с LinkedList.
6. Сравнить время работы пятого и шестого пунктов. */

package Homework3;

import java.util.*;
import static java.lang.Math.abs;

public class Task {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            list.add(new Random().nextInt(100));
        }
        System.out.println("Список " + list);

        list.sort(Comparator.reverseOrder());
        System.out.println("Обратная сортировка " + list);

        System.out.println("Список без четных чисел" + removeNum(list));

        System.out.println("Максимальное значение " + Collections.max(list));
        System.out.println("Минимальное значение " + Collections.min(list));

        int sum = 0;
        for (int n: list){
            sum = sum + n;
        }int avg = sum/ list.size();

        ArrayList<Integer> list5 = new ArrayList<>();
        for (int c = 0; c < list.size(); c++){
            list5.add(abs(list.get(c) - avg));
        }
        int index = list5.indexOf(Collections.min(list5));
        System.out.println("Среднее значение " + list.get(index));

        ArrayList<Integer> list2 = new ArrayList<>();
        for (int a = 0; a < 10; a++) {
            list2.add(new Random().nextInt(100));
        }
        System.out.println(list2);

        list2.removeAll(list);
        list.addAll(list2);
        System.out.println(list);

        double start = System.currentTimeMillis();
        ArrayList<Integer> list3 = new ArrayList<>();
        for (int b = 0; b < 10001; b++) {
            list3.add(0,0);}
        double finish = System.currentTimeMillis();
        System.out.println("Время " + (finish-start));

        start = System.currentTimeMillis();
        LinkedList<Integer> list4 = new LinkedList<>();
        for (int b = 0; b < 10001; b++) {
            list4.add(0,0);}
        finish = System.currentTimeMillis();
        System.out.println("Время " + (finish-start));

    }

    static ArrayList removeNum(ArrayList<Integer> list) {
        ArrayList<Integer> list1 = new ArrayList<>();
        for (int j = 0; j < list.size(); j++) {
            if ((list.get(j)) % 2 != 0) {
                list1.add(list.get(j));

            }
        }
        return list1;

    }
}
