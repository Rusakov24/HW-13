
public class Book {
    private String bookTitle;
    private Author nameOfAuthor;
    private int publicationYear;
    public Book (String bookTitle, Author nameOfAuthor, int publicationYear) {
        this.bookTitle = bookTitle;
        this.publicationYear = publicationYear;
        this.nameOfAuthor = nameOfAuthor;
    }
    @Override
    public boolean equals(Object o) {
        if (this == o) return  true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return bookTitle.equals(book.bookTitle) && nameOfAuthor.equals(book.nameOfAuthor) && publicationYear == book.publicationYear;

    }
    @Override
    public int hashCode() {
        return java.util.Objects.hash(bookTitle);
    }
    public String getBookTitle() {
        return bookTitle;
    }
    public int getPublicationYear() {
        return publicationYear;
    }
    public Author getNameOfAuthor(){
        return nameOfAuthor;
    }
    public void setPublicationYear(int publicationYear){
        this.publicationYear = publicationYear;
    }
    @Override
    public String toString () {
        return "Книга: " + this.getBookTitle() + ", автор: " + this.getNameOfAuthor() + ", год издания:" + this.getPublicationYear();
    }
}
