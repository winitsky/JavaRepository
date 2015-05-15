package lab16;

/**
 * Задание 16
 * Найти в строке не только запятые, но и другие знаки препинания. Подсчитать общее их количество.
 */
public class FindPunctuation {
    private String str;

    FindPunctuation(String str) {
        this.str = str;
    }

    public int find() {
        int n = 0;
        for (int i = 0; i < str.length(); i++) {
            char symbol = str.charAt(i);
            if (symbol == ',' || symbol == ':' || symbol == '-' || symbol == '.' || symbol == '-') {
                n++;
            }
        }
        return n;
    }


}
