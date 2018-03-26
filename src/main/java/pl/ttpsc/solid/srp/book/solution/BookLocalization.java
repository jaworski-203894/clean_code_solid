package pl.ttpsc.solid.srp.book.solution;

public class BookLocalization {
    private String libraryRoomName;
    private String rowLocator;
    private int indexOnShelf;
    private Book book;

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public BookLocalization(String libraryRoomName, String rowLocator, int indexOnShelf, Book book) {
        this.libraryRoomName = libraryRoomName;
        this.rowLocator = rowLocator;
        this.indexOnShelf = indexOnShelf;
        this.book = book;
    }

    public String getLibraryRoomName() {
        return libraryRoomName;
    }

    public void setLibraryRoomName(String libraryRoomName) {
        this.libraryRoomName = libraryRoomName;
    }

    public String getRowLocator() {
        return rowLocator;
    }

    public void setRowLocator(String rowLocator) {
        this.rowLocator = rowLocator;
    }

    public int getIndexOnShelf() {
        return indexOnShelf;
    }

    public void setIndexOnShelf(int indexOnShelf) {
        this.indexOnShelf = indexOnShelf;
    }
}
