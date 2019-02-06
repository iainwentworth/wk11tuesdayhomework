import java.util.ArrayList;

public class Library {

    private ArrayList<Book> stock;
    private int capacity;

    public Library(){
        this.stock = new ArrayList<Book>();
        this.capacity = 10000;
    }

    public int stockCount(){
        return this.stock.size();
    }

    public void addBook(Book book) {
        if (this.stock() < this.capacty()) {
            this.stock.add(book);
        }
    }

    public int getCapacity() {
        return capacity;
    }
}
