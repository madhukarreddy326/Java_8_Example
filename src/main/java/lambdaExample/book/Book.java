package lambdaExample.book;

public class Book {

    private int id;
    private int pages;
    private String name;

    public Book(int id, String name,int pages ) {
        this.id = id;
        this.pages = pages;
        this.name = name;
    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//        Book book = (Book) o;
//        return id == book.id && pages == book.pages && Objects.equals(name, book.name);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(id, pages, name);
//    }

    public void setId(int id) {
        this.id = id;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getPages() {
        return pages;
    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", pages=" + pages +
                ", name='" + name + '\'' +
                '}';
    }
}
