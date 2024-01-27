package az.babayev.javarush.javasyntax.task.task15.file_utils;

import java.io.FileNotFoundException;
import java.nio.file.FileSystemException;

/*
В методе copyFile перехвати исключения, которые бросают методы readFile и writeFile.
Перехваченные исключения оберни в RuntimeException и пробрось дальше.
 */
public class Solution {

    public static void main(String[] args) {
        copyFile("book.txt", "book_final_copy.txt");
        copyFile("book_final_copy.txt", "book_last_copy.txt");
    }

    static void copyFile(String sourceFile, String destinationFile) {
        try {
            FileUtils.readFile(sourceFile);
            FileUtils.writeFile(destinationFile);
        } catch (FileSystemException | FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }

}
