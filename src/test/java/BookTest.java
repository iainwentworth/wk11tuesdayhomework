import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {

    Book book;

    @Before
    public void before(){
        book = new Book("Book1", "Author1", "Genre1");
    }

    @Test
    public void hasTitle(){
        assertEquals("Book1", book.getTitle());
    }

    @Test
    public void hasAuthor(){
        assertEquals("Author1", book.getAuthor());
    }

    @Test
    public void hasGenre(){
        assertEquals("Genre1", book.getGenre());
    }
}

