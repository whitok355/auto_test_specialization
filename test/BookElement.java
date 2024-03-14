public class BookElement {
    private int id;
    private int year;
    private String author;
    public BookElement(int id, int year, String author){
        this.id = id;
        this.year = year;
        this.author = author;
    }
    public int getId() {
        return id;
    }
    public int getYear() {
        return year;
    }
    public String getAuthor() {
        return author;
    }

    @Override
    public String toString() {
        return String.format("id %s year %s auth ", this.id, this.year, this.author);
    }
}
