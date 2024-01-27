package az.babayev.javarush.javasyntax.task.task15.file_manager;

import java.io.FileNotFoundException;
import java.nio.file.FileSystemException;

/*
В методе main перехвати RuntimeException. Определи, какое исключение в нем сохранено.
Если это
FileNotFoundException, выведи в консоли сообщение: "Не удалось прочесть файл.",
а если FileSystemException — "Не удалось записать в файл."
 */
public class FileManager {

    private void readFile(String filePath) throws FileNotFoundException {
        System.out.println("Читаем содержимое файла " + filePath);
    }

    private void writeFile(String filePath) throws FileSystemException {
        System.out.println("Записываем данные в файл " + filePath);
    }

    public void copyFile(String sourceFile, String destinationFile) {
        try {
            readFile(sourceFile);
            writeFile(destinationFile);
        } catch (FileNotFoundException | FileSystemException e) {
            throw new RuntimeException();
        }
    }
}
