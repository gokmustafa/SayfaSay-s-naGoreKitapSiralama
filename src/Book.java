import java.util.Comparator;

public class Book {
    private String name;
    private String autor;
    private int year;
    private String publisher;
    private int page;

    public Book(String name, String autor, int year, String publisher, int page) {
        this.name = name;
        this.autor = autor;
        this.year = year;
        this.publisher = publisher;
        this.page = page;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public int getPage() {
        return page;
    }

    public void setPage(int page) {
        this.page = page;
    }
}
