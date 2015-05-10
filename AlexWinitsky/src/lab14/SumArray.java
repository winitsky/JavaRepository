package lab14;

/**
 * Задание 14
 * Определите сумму элементов одномерного массива, расположен-ных между минимальным и максимальным значениями.
 */
public class SumArray {
    public static void main(String[] args) {
        int array[] = {2, 3, 7, 5, 9, 10, 9, 2, 6, 5, 4};
        int max = 0;
        int min = 0;
        int idMax = 0;
        int idMin = 0;
        int sum = 0;

        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
                idMax = i;
            }
            if (min > array[i]) {
                min = array[i];
                idMin = i;
            }
        }

        for (int i = (idMin + 1); i < idMax; i++) {
            sum += array[i];
        }
        System.out.println("Сумма элемнтов массива между минимумом и максимумом = " + sum);
    }
}
