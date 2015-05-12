package addtask9;

/**
 *6.	Написать программу, вычисляющую значение функции  для различных значений аргумента x, задавая его как целое число
 */
public class TestFormula {
    public static void main(String[] args) {
        Formula formula=new Formula(20);
        System.out.println(formula.function1());
        System.out.println(formula.function2());
    }
}
