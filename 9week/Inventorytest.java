import java.util.*;

// Generic Inventory class that can store any type of item
class Inventory<T> {
    private List<T> items = new ArrayList<>();

    // Add an item to inventory
    public void addItem(T item) {
        items.add(item);
    }

    // Show all items in inventory
    public void showItems() {
        for (T item : items) {
            System.out.println(item);
        }
    }
}

// Book class for storing book information
class Book {
    private String title;
    private String author;
    private double price;

    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public String toString() {
        return title + " by " + author + " - Rs." + price;
    }
}

// Electronic class for storing electronic item information
class Electronic {
    private String name;
    private String brand;
    private double price;

    public Electronic(String name, String brand, double price) {
        this.name = name;
        this.brand = brand;
        this.price = price;
    }

    public String toString() {
        return name + " (" + brand + ") - Rs." + price;
    }
}

public class Inventorytest {
    public static void main(String[] args) {
        Inventory<Book> books = new Inventory<>();
        books.addItem(new Book("Java Programming", "John Doe", 450));
        books.addItem(new Book("Data Structures", "Jane Smith", 380));

        Inventory<Electronic> electronics = new Inventory<>();
        electronics.addItem(new Electronic("Laptop", "Dell", 45000));
        electronics.addItem(new Electronic("Smartphone", "Samsung", 25000));

        System.out.println("Books:");
        books.showItems();

        System.out.println("\nElectronics:");
        electronics.showItems();
    }
}
 
