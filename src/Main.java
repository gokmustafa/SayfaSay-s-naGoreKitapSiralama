import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        TreeSet<Book> books = new TreeSet<>(new OrderBooks());
        books.add(new Book("Dost Kazanma", "Dale Carnegie", 1937, "epsilon", 304));
        books.add(new Book("Bahane Yok","Brian Tracy", 1997, "Kreatif", 286));

        for (Book bk : books ){
            System.out.println(bk.getName());
        }
    }
}
