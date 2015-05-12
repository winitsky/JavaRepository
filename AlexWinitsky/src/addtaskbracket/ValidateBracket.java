package addtaskbracket;

/**
 * Проверка правильности кавычек (
 */
public class ValidateBracket {
    public static void main(String[] args) {
        String str = "При выполнении ((данной() строки,( (т.е. учеников) в нашем классе) )))в виде числа.";
        char bracket1 = '(';
        char bracket2 = ')';
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (bracket1 == str.charAt(i)) {
                count++;
            }
            if (bracket2 == str.charAt(i)) {
                count--;
            }
        }

        if (count != 0) {
            System.out.println("В выражении: " + str + " -есть не закрытая скобка");
        } else {
            System.out.println("В выражении: " + str + " -со скобками проблем нет");
        }
    }
}
