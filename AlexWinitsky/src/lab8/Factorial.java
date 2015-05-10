package lab8;

/**
 * Задание 8
 * Изменить пример с суммой чисел таким образом, чтобы рассчиты-валась не сумма, а произведение, т.е. факториал числа.
 */
public class Factorial {
    public static void main(String[] args) {
        int factorial = 1;
        int sum = 0;
        int number = (int) (Math.random() * 5);
        while (number != 0) {
            sum += number;
            number = (int) (Math.random() * 5);
        }
        int i = 2;
        while (i <= sum) {
            factorial *= i;
            i++;
        }
        System.out.println("Факториал числа : " + sum + " = " + factorial);
    }
}
