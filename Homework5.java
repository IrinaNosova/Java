/* Создать множество, ключь и значение строки. Добавить шесть элементов. Вывести в консоль значения. Добавить ко всем
значениям символ "!".
Создать второе множество с таким же обобщением. Ключи второго множества частично совпадают с ключеми первого.
Объеденить значания во втором множестве и первом если ключи совподают. Вывести результат в консоль.
 */

import java.util.HashMap;
import java.util.Objects;

public class Homework5 {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        map.put("один", "one");
        map.put("два", "two");
        map.put("три", "three");
        map.put("четыре", "four");
        map.put("пять", "five");
        map.put("шесть", "six");
        System.out.println(map);
        for (String key : map.keySet()) {
            map.compute(key, (k, v) -> v + "!");
        }
        System.out.println(map);

        HashMap<String, String> map2 = new HashMap<>();
        map2.put("один", "one");
        map2.put("пять", "cinq");
        map2.put("четыре", "four");
        map2.put("семь", "sept");
        map2.put("восемь", "huit");
        map2.put("три", "three");
        System.out.println(map2);
        for (String key : map2.keySet()) {
            map2.compute(key, (k, v) -> v + "!");
        }
        System.out.println(map2);

        HashMap<String, String> map3 = new HashMap<>();

        map3.putAll(map);
        map3.putAll(map2);
        System.out.println(map3);
    }
}

