package pl.ttpsc.solid.srp.book.solution;

public class Printer {
    private Book book;
    private int currentPage = 0;

    public Printer(Book book) {
        this.book = book;
    }
    public String print() {
        StringBuilder allPages = new StringBuilder();

        currentPage = 0;
        while(hasNext()) {
            allPages.append(printCurrentPage());
        }

        return allPages.toString();
    }
    public String printCurrentPage() {
        return book.getPages().get(currentPage);
    }

    public boolean hasPrev() {
        return currentPage != 0;
    }
    public boolean hasNext() {
        return currentPage != book.size() - 1;
    }

    public void nextPage() {
        if(hasNext()) {
            currentPage++;
        }
    }
    public void prev() {
        if(hasPrev()) {
            currentPage--;
        }
    }
}
