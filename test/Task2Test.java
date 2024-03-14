import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class Task2Test {

//    public static void main(String[] args) {
//        BookRepository bookRepository = new BookRepository();
//        BookService bookService = new BookService(bookRepository);
//
//        System.out.println(bookService.getBooks(1).toString());
//    }
    int id = 1;
    int year = 1990;
    String author = "Ivanov";
    @Mock
    private static BookRepository bookRepository = mock(BookRepository.class);
    @Test
    void BookServiceTest(){
        BookService bookService = new BookService(bookRepository);
        when(bookService.getBooks(1)).thenReturn(new BookElement(id, year, author));

        assertNotNull(bookService.getBooks(1));
        assertEquals(1, bookService.getBooks(id).getId());
        assertEquals(year, bookService.getBooks(id).getYear());
        assertEquals(author, bookService.getBooks(id).getAuthor());
    }


}
