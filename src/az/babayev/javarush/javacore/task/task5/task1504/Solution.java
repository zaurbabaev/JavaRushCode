package az.babayev.javarush.javacore.task.task5.task1504;

import java.util.LinkedList;
import java.util.List;

public class Solution {

    public static void main(String[] args) {
        List<Book> books = new LinkedList<>();
        books.add(new MarkTwainBook("Tom Sawyer"));
        books.add(new AgathaChristieBook("Hercule Poirot"));
        System.out.println(books);
        books.forEach(s-> System.out.println(s.getTitle()));
    }

    abstract static class Book {
        private final String author;

        public Book(String author) {
            this.author = author;
        }

        public abstract Book getBook();

        public abstract String getTitle();

        private String getOutPutByBookType() {
            String agathaChristieOutput = author + ": " + getBook().getTitle() + " is a detective";
            String markTwainOutput = getBook().getTitle()+ " was written by " + author;
            String output = "output";
            return switch (author) {
                case "Mark Twain" -> markTwainOutput;
                case "Agatha Christie" -> agathaChristieOutput;
                default -> output;
            };

        }

        // instance of vasitəsilə kitabın hansı klasdan yarandığını yoxlayaraq
        private String getOutPutByBookType2() {
            String agathaChristieOutput = author + ": " + getBook().getTitle() + " is a detective";
            String markTwainOutput = getBook().getTitle() + " was written by " + author;

            String output = "output";
            if (getBook() instanceof MarkTwainBook) {
                output = markTwainOutput;
            } else if (getBook() instanceof AgathaChristieBook) {
                output = agathaChristieOutput;
            }
            return output;

        }

        // this of vasitəsilə kitabın hansı klasdan yarandığını yoxlayaraq
        private String getOutPutByBookType3() {
            String agathaChristieOutput = author + ": " + getBook().getTitle() + " is a detective";
            String markTwainOutput = getBook().getTitle() + " was written by " + author;

            String output = "output";
            if (this instanceof MarkTwainBook) {
                output = markTwainOutput;
            } else if (this instanceof AgathaChristieBook) {
                output = agathaChristieOutput;
            }
            return output;

        }

        public String toString() {
            return getOutPutByBookType();
        }
    }


    public static class MarkTwainBook extends Book {

        private final String title;

        public MarkTwainBook(String title) {
            super("Mark Twain");
            this.title = title;
        }

        @Override
        public MarkTwainBook getBook() {
            return this;
        }

        @Override
        public String getTitle() {
            return title;
        }
    }

    public static class AgathaChristieBook extends Book {

        private final String title;

        public AgathaChristieBook(String title) {
            super("Agatha Christie");
            this.title = title;
        }

        @Override
        public AgathaChristieBook getBook() {
            return this;
        }

        @Override
        public String getTitle() {
            return title;
        }
    }

}
