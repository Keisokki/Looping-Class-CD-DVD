// Subclass
public class DVD extends Product {
    private String studio;
    private String rating;
    private int length;

        public DVD(){
            super();
            this.studio = "";
            this.rating = "";
            this.length = 0;
        }
        // Constructor Parameter
        public DVD(int number, String name, double price, int
        quantity, String studio, String rating, int length) {
            super(number, name, price, quantity);
            this.studio = studio;
            this.rating = rating;
            this.length = length;
        }

        // Getter & Setter
    public String getStudio() {
        return this.studio;
    }

    public void setStudio(String studio) {
        this.studio = studio;
    }

    public String getRating() {
        return this.rating;
    }

    public void setRating(String rating) {
        this.rating = rating;
    }

    public int getLength() {
        return this.length;
    }

    public void setLength(int length) {
        this.length = length;
    }
    @Override
    // Override method
    public void print() {
        super.print();
        System.out.println("Studio: " + studio);
        System.out.println("Rating: " + rating);
        System.out.println("Length: " + length + " minutes");
        System.out.println("--------------------------------");
    }
}
