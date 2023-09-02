package book;

import author.Author;

public class Tester {
    // Задание 7
    public static void main(String[] args) {
        BookShelf bookShelf = new BookShelf();
        Author author = new Author("Михаил Булгаков", "bulgakov@lol.com", 'm');
        bookShelf.add(new Book(author, "Мастер и Маргарита", 1940));
        bookShelf.add(new Book(author, "Собачье сердце", 1925));
        bookShelf.add(new Book(author, "Был май", 1934));
        bookShelf.add(new Book(author, "Тайному другу", 1987));
        System.out.println(bookShelf.size());
        bookShelf.sortByYear();
        System.out.println(bookShelf);
    }
}
