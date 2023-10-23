package week5.BookList;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Book> bookList = new ArrayList<>();

        bookList.add(new Book("Suç ve Ceza", "Fyodor Dostoyevski", "1866", 671));
        bookList.add(new Book("Don Kişot", "Miguel de Cervantes", "1605", 987));
        bookList.add(new Book("Madame Bovary", "Gustave Flaubert", "1857", 408));
        bookList.add(new Book("Savaş ve Barış", "Lev Tolstoy", "1869", 1225));
        bookList.add(new Book("Ulysses", "James Joyce", "1922", 732));
        bookList.add(new Book("Moby-Dick", "Herman Melville", "1851", 625));
        bookList.add(new Book("Cesaret Ana", "Isabel Allende", "1982", 460));
        bookList.add(new Book("Karamazov Kardeşler", "Fyodor Dostoyevski", "1880", 796));
        bookList.add(new Book("Yüzüklerin Efendisi", "J.R.R. Tolkien", "1954-1955", 1178));
        bookList.add(new Book("Veba Geceleri", "Albert Camus", "1947", 308));


        Map<String, String> bookMap = bookList.stream().collect(Collectors.toMap(Book::getName, Book::getAuthor));
        List<Book> filteredBookList = bookList.stream().filter(book -> book.getPage() > 100).toList();

        System.out.println(bookMap);
        filteredBookList.forEach(i -> System.out.println(i.getName()));

    }
}