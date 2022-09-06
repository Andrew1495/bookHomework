import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {

    public Book book;

    @Before
    public void setUp(){
        book = new Book("Lord of the rings", "Toliken", "Fantasy" );
    }

    @Test
    public void bookHasName(){
        assertEquals("Lord of the rings", book.getTitle());
    }
    @Test
    public void bookHasAuthor(){
        assertEquals("Toliken", book.getAuthor());
    }

    @Test
    public void bookHasGenre(){
        assertEquals("Fantasy", book.getGenre());
    }




}
