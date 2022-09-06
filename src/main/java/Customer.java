import java.util.ArrayList;

public class Customer {
    private ArrayList<Book> collection;

    public Customer(){
        this.collection = new ArrayList<Book>();
    }

    public void borrowBook(Libary libary){
        if(libary.getStockCount() != 0){
            this.collection.add(libary.removeBook());
        }
    }

    public int getCollectionCount(){
        return this.collection.size();
    }

    public Book returnBook(){
            return this.collection.remove(0);
        }

}


