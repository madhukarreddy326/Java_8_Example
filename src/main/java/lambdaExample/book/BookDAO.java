package lambdaExample.book;

import java.util.ArrayList;
import java.util.List;

public class BookDAO {

    public List<Book> getAllBooks()
    {
        ArrayList<Book> books = new ArrayList<>();
        books.add(new Book(1,"java",200));
        books.add(new Book(2,"hibernate",434));
        books.add(new Book(3,"spring",334));
        books.add(new Book(4,"webservices",555));
        System.out.println("Books Object before the Sorting::"+books);
        return books;

    }
}
