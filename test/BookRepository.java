import java.util.ArrayList;
import java.util.List;

public class BookRepository {

    private List<BookElement> bookElements = new ArrayList<>();
    void generator(){
        bookElements.add(new BookElement(1, 1995, "asdzcxvbf"));
        bookElements.add(new BookElement(2, 1994, "Ads"));
        bookElements.add(new BookElement(3, 1993, "hgf"));
        bookElements.add(new BookElement(4, 1992, "sdfczxc"));
        bookElements.add(new BookElement(5, 1991, "xcvbnm"));
        bookElements.add(new BookElement(7, 1996, "q3w4refd"));
    }
    public BookElement getBook(int id){
        return bookElements.get(id);
    }
}
