// Ini SuperClass
public class Product{
    protected static int number;
    protected String name;
    private double price;
    private int quantity;

    public Product(){
        this.number = 0;
        this.name = "";
        this.price = 0.0;
        this.quantity = 0;
    }
    // Constructor Parameters
    public Product(int number, String name, double price,
    int quantity) {
        this.number = number;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getNumber() {
        return this.number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public int getQuantity() {
        return this.quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
    //Constructor
    public Product(String name, double price, int number, int quantity){
        this.name = name;
        this.price = price;
        this.number = number;
        this.quantity = quantity;
    }

    public void print() {
        System.out.println("-------------------------");
        System.out.println("Number: " + number);
        System.out.println("Name: " + name);
        System.out.println("Price: " + price);
        System.out.println("Quantity: " + quantity);
    }
    
}