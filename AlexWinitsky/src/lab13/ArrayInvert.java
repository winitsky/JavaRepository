package lab13;

import java.util.Arrays;

/**
 * Задание 13
 * Создать массив, заполнить его случайными элементами, распеча-тать, перевернуть, и снова распечатать (при переворачивании нежела-тельно создавать еще один массив).
 */
public class ArrayInvert {
    public static void main(String[] args) {
        int array[] = new int[6];

        System.out.println("Исходный массив ");
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (10 * Math.random());
        }
        System.out.println(Arrays.toString(array));

        for (int i = 0; i < array.length / 2; i++) {
            int first = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = first;
        }

        System.out.println("");
        System.out.println("Перевернутый массив ");
        System.out.println(Arrays.toString(array));

    }
}

