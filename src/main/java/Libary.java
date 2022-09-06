import java.util.ArrayList;
import java.util.HashMap;

public class Libary {

    private ArrayList<Book> stock;
    private int capacity;

    private HashMap<String, Integer > genreTotal;

    public Libary(int capacity){
        this.stock = new ArrayList<Book>();
        this.capacity = capacity;
        this.genreTotal = new HashMap<String, Integer>();
    }

    public int getStockCount(){
        return this.stock.size();
    }

    public void addBook(Book book) {
        if (getStockCount() < this.capacity) {
            this.stock.add(book);
        }
    }


    public Book removeBook(){
            return this.stock.remove(0);
        }

    public int getCapacity() {
        return capacity;
    }

    public HashMap<String, Integer> getGenreTotal(){
        return this.genreTotal;
    }

    public void genreCount(){
        for (int i = 0; i < this.getStockCount(); i++) {
            Book book = this.stock.get(i);
            String genre = book.getGenre();
            this.genreTotal.putIfAbsent(genre, 0);
            Integer temp = this.genreTotal.get(genre);
            this.genreTotal.replace(genre, temp +1);


        }
    }

    public int getGenreFeq(String genre){
        return this.genreTotal.get(genre);
    }

}


