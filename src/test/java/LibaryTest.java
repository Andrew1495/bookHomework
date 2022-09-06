import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Optional;

import static org.junit.Assert.assertEquals;

public class LibaryTest {

    public Book book;
    public Libary libary;

    @Before
    public void setUp(){
        libary = new Libary(2);
        book = new Book("Lord of the rings", "Toliken", "Fantasy" );
    }

    @Test
    public void hasCapacity(){
        assertEquals(2, libary.getCapacity());
    }
    @Test
    public void stockCountStartsZero(){
        assertEquals(0, libary.getStockCount());
    }

    @Test
    public void addBook(){
        libary.addBook(book);
        assertEquals(1, libary.getStockCount());
    }

    @Test
    public void checkCapacityBook(){
        libary.addBook(book);
        libary.addBook(book);
        libary.addBook(book);
        assertEquals(2, libary.getStockCount());
    }

    @Test
    public void removeBook(){
        libary.addBook(book);
        libary.addBook(book);
        libary.removeBook();
        assertEquals(1, libary.getStockCount());
    }

    @Test
    public void checkGenreTotal(){
        libary.addBook(book);
        libary.addBook(book);
        libary.genreCount();
        assertEquals( 2 , libary.getGenreFeq("Fantasy"));
    }




}
