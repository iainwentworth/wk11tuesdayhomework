import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LibraryTest {

    Library library;
    Book book;

    @Before
    public void before(){
        library = new Library();
        book = new Book("Book2", "Author2", "Genre2");
    }

    @Test
    public void stockStartsOffEmpty(){
        assertEquals(0, library.stockCount());
    }

    @Test
    public void canAddBook(){
        library.addBook(book);
        assertEquals(1, library.stockCount());
    }

    @Test
    public void hasCapacity(){
        assertEquals(10000, library.getCapacity());
    }

}
