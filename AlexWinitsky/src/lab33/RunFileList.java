package lab33;

/**
 Задание 33
 Вывести список файлов и каталогов выбранного каталога на диске. Файлы и каталоги должны быть распечатаны отдельно.
 */
public class RunFileList {
    public static void main(String[] args) {

        ListFileAndFolders listFileAndFolders =new ListFileAndFolders();
        listFileAndFolders.printFilesAndFolders();
    }
}
