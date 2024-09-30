public class CD extends Product {
    private String artist;
    private int totalSong;
    private String label;

    public String getArtist() {
        return this.artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public int getTotalSong() {
        return this.totalSong;
    }

    public void setTotalSong(int totalSong) {
        this.totalSong = totalSong;
    }

    public String getLabel() {
        return this.label;
    }

    public void setLabel(String label) {
        this.label = label;
    }

    public CD() {
        super();
        number = 10;
        nama = "KILL";
        quantity = 100;
        price = 20000.0;
        artist = "juna";
        totalSong = 50;
        label = "Sony Music";
    }

    public CD (String artist, int totalSong, String label) {
        this.artist = artist;
        this.totalSong = totalSong;
        this.label = label;
    }

    public CD(int number, String nama, int quantity, double price, String artist, int totalSong, String label) {
        super(number, nama, quantity, price);
        this.artist = artist;
        this.totalSong = totalSong;
        this.label = label;
    }
    

    @Override
    public void print() {
        super.print();
        System.out.println("Artist: " + artist);
        System.out.println("Total Song: " +totalSong);
        System.out.println("Label: " + label);
    }
}
