package lambdaExample.book;

import java.util.List;

public class BookService {

    public static void main(String[] args)
    {
        System.out.println("The books values are : "+new BookService().getBooksInSortingOrder());
    }

    public List<Book> getBooksInSortingOrder()
    {
        List<Book> books = new BookDAO().getAllBooks();
        //this is the example of sorting logic using the lambda expression
        books.sort((o1, o2) -> o2.getName().compareTo(o1.getName()));
        //anothe style of writing sorting logic
//        Collections.sort(books, new Comparator<Book>() {
//            @Override
//            public int compare(Book o1, Book o2) {
//                return o1.getName().compareTo(o2.getName());
//            }
//        });
        return books;
    }

    //old style of  compare
//class MyComparator implements Comparator<Book>
//{
//
//    @Override
//    public int compare(Book o1, Book o2) {
//        return o1.getName().compareTo(o2.getName());
//    }
//}
}
