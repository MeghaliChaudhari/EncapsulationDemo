package data;

public class Book {
    private String title;
    private int yearOfPublication;
    private long isbn;
    private String authorName;

    public void setTitle(String title){
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setYearOfPublication(int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }

    public void setIsbn(long isbn) {
        this.isbn = isbn;
    }

    public long getIsbn() {
        return isbn;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }
    public String getAuthorName(){
        return authorName;
    }
}
