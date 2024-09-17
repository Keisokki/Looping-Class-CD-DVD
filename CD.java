// Subclass
public class CD extends Product {
    private String artist;
    private int numSong;
    private String label;

    public CD(){
        super(); // Mengakses Constructor Super Class
        artist = "";
        numSong = 0;
        label = "";
    }
    // Constructor Parameters
    public CD(int number, String name, double
    price, int quantity, String artist, int numSong, String label){
        super(number, name, price, quantity);
        this.artist = artist;
        this.numSong = numSong;
        this.label = label;
    }
    public String getArtist() {
        return this.artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public int getNumSong() {
        return this.numSong;
    }

    public void setNumSong(int numSong) {
        this.numSong = numSong;
    }

    public String getLabel() {
        return this.label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    @Override
    // Override. Membuat method yg sama denvgan superclass
    public void print() {
        super.print(); // Memanggil method print() di superclass
        System.out.println("artist" + artist);
        System.out.println("numSong" + numSong);
        System.out.println("label" + label);
        System.out.println("-------------------------");
    }
}
