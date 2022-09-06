import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CustomerTest {
    public Book book;
    public Libary libary;

    public Customer customer;

    @Before
    public void setUp(){
        customer = new Customer();
        libary = new Libary(2);
        book = new Book("Lord of the rings", "Toliken", "Fantasy" );
    }
    @Test
    public void collectionStartsEmpty(){
      assertEquals(0, customer.getCollectionCount());
    }
    @Test
    public void addBook(){
        libary.addBook(book);
        customer.borrowBook(libary);
        assertEquals(1, customer.getCollectionCount());
    }
    @Test
    public void removeBook(){
        libary.addBook(book);
        customer.borrowBook(libary);
        libary.addBook(customer.returnBook());
        assertEquals(0 ,customer.getCollectionCount());

    }


}
