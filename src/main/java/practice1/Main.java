package practice1;

import java.util.Arrays;
import java.util.function.Consumer;

public class Main {

    /**
     * вариант 15
     * Имплементировать интерфейс Consumer, принимающий на вход массив чисел и выводящий в консоль в порядке возрастания
     */
    public static void main(String[] args) {
        Consumer<int[]> arraysConsumer = array -> {
            Arrays.sort(array);
            Arrays.stream(array).forEach(System.out::println);
        };
        arraysConsumer.accept(new int[]{1, 4, 0, -2});
    }
}
