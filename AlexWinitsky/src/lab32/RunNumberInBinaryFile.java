package lab32;

/**
 Задание 32
 Записать в двоичный файл 20 случайных чисел.
 Прочитать запи-санный файл, распечатать числа и их среднее арифметическое.
 */
public class RunNumberInBinaryFile {
    public static void main(String[] args) {
        BinaryFile binaryFile=new BinaryFile();
        binaryFile.writeFile();
        binaryFile.readFile();
    }
}
