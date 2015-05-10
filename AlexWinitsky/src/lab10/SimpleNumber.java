package lab10;

/**
 * Задание 10
 * Имеется целое число, определить является ли это число простым, т.е. делится без остатка только на 1 и себя.
 */
public class SimpleNumber {
    public static void main(String[] args) {
        int number = 18;
        boolean simpleNumber = true;
        for (int i = 2; i < number; i++) {
            if ((number % i) == 0) {
                simpleNumber = false;
                break;
            }
        }
        if (simpleNumber) {
            System.out.println("Число " + number + " простое");
        } else {
            System.out.println("Число " + number + " составное");
        }
    }
}
