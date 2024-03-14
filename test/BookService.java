import java.awt.print.Book;

public class BookService{
    BookRepository bookRepository;
    public BookService(BookRepository bookRepository){
        this.bookRepository = bookRepository;
    }
    public BookElement getBooks(int id) {
         return bookRepository.getBook(id);
    }
}
