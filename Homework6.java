/*Разработать программу, имитирующую поведение коллекции HashSet. В программе содать метод add добавляющий элемент,
        метод toString возвращающий строку с элементами множества и метод позволяющий читать элементы по индексу.
        *Реализовать все методы из семинара.
        Формат данных Integer. */

import java.util.*;
public class Homework6 {
    public static void main(String[] args) {
        mySet mySet = new mySet();

        for (int i = 0; i <= 10; i++) {
            mySet.add(new Random().nextInt(100));

        }

        System.out.println(mySet.contains(7));
        System.out.println(Arrays.toString(mySet.toArray()));
        Iterator<Integer> iterator = mySet.iterator();
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + " ");
        }
        System.out.println();
        System.out.println(mySet.getItem(3));

    }
}

class mySet {
    static final Object OBJECT = new Object();
    private LinkedHashMap<Integer, Object> hashMap = new LinkedHashMap<>();

    public boolean add(int num) {
        return hashMap.put(num, OBJECT) == null;
    }

    public boolean contains(int num) {
        return hashMap.containsKey(num);
    }

    public Object[] toArray() {
        return hashMap.keySet().toArray();
    }

    public Iterator<Integer> iterator() {
        return hashMap.keySet().iterator();
    }

    public Integer getItem(int index) {
        return (Integer) toArray()[index];
    }

}