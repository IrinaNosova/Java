/* Первый семинар.
1. Выбросить случайное целое число в диапазоне от 0 до 2000 и сохранить в i
2. Посчитать и сохранить в n номер старшего значащего бита выпавшего числа
3. Найти все кратные n числа в диапазоне от i до Short.MAX_VALUE сохранить в массив m1
4. Найти все некратные n числа в диапазоне от Short.MIN_VALUE до i и сохранить в массив m2

Пункты реализовать в методе main
*Пункты реализовать в разных методах

int i = new Random().nextInt(k); //это кидалка случайных чисел!) */

import java.util.Random;

public class Homework1 {
    public static void main(String[] args) {
        Random random = new Random();
        int i = random.nextInt(2000);
        System.out.println("i =  " + i);

        int n = Integer.toBinaryString(i).length()-1;
        System.out.println("n =  "+n);

        short count = 0;
        for (int l = i; l < Short.MAX_VALUE; l++){
            if ( l % n == 0) {
                count++;
            }
        }
        System.out.println("m1 =  "+ count);
        int[] m1 = new int [count];
        count = 0;

        for (int l = i; l < Short.MAX_VALUE; l++){
            if (l % n == 0) {
                m1[count++] = l;
            }
        }

        count = 0;

        for (int l = Short.MIN_VALUE; l < i; l++){
            if ( l % n != 0) {
                count++;
            }
        }
        System.out.println("m2 =  "+ count);
        int[] m2 = new int [count];
        count = 0;

        for (int l = Short.MIN_VALUE; l < i; l++){
            if (l % n != 0) {
                m2[count++] = l;
            }
        }

    }
}
