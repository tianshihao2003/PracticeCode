package stage02;

public class Book {
    private String name;
    private double price;

    public Book(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public void updatePrice() {
        if (this.price > 150) {
            this.price = 150;
        } else if (this.price>100) {
            this.price = 100;
        }
    }

    public String toString() {
        return "Book [name=" + name + ", price=" + price + "]";
    }

    public static void main(String[] args) {
        Book book = new Book("java", 200);
        book.updatePrice();
        System.out.println(book);
        System.out.println(book.toString());

    }

}
