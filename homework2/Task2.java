/* Сравнить скорость работы реплейса классов String и StringBuilder. */

package homework2;

public class Task2 {
    public static void main(String[] args) {
        String my_string = """
                Я помню чудное мгновенье:
                Передо мной явилась ты,
                Как мимолетное виденье,
                Как гений чистой красоты.
                                
                В томленьях грусти безнадежной,
                В тревогах шумной суеты,
                Звучал мне долго голос нежный
                И снились милые черты.
                                
                Шли годы. Бурь порыв мятежный
                Рассеял прежние мечты,
                И я забыл твой голос нежный,
                Твои небесные черты.""";

        double begin = System.nanoTime();
        double begin1 = System.currentTimeMillis();

        String search = "небесные";
        System.out.println(my_string);

        System.out.println("\n" + my_string.replace(search, "красивые"));
        double end = System.nanoTime();
        double end1 = System.currentTimeMillis();

        System.out.println("\n Время работы в наносекундах = " + (end - begin));
        System.out.println(" Время работы в милисекундах = " + (end1 - begin1));

        begin = System.nanoTime();
        begin1 = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder(my_string);
        while (sb.indexOf(search) > 0) {
            sb.replace(sb.indexOf(search), sb.indexOf(search) + search.length(), "красивые");
        }
        System.out.println("\n" + sb);

        end = System.nanoTime();
        end1 = System.currentTimeMillis();
        System.out.println("\n Время работы в наносекундах = " + (end - begin));
        System.out.println(" Время работы в милисекундах = " + (end1 - begin1));
    }
}

