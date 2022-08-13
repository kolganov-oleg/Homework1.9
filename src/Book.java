public class Book {
    private final String title;
    private int publishDate;
    private final Author author;

    public Book(String title, int publisfDate, Author author) {
        this.title = title;
        this.publishDate = publisfDate;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public int getPublishDate() {
        return publishDate;
    }

    public Author getAuthor() {
        return author;
    }

    public void setPublishDate(int publisfDate) {
        this.publishDate = publisfDate;
    }
}
