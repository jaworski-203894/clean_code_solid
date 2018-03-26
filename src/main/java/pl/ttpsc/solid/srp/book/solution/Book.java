package pl.ttpsc.solid.srp.book.solution;

import java.util.HashMap;
import java.util.Map;

public class Book {
    private String title;
    private String author;
    private Map<Integer, String> pages = new HashMap<>();

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPage(Integer page) {
        if(pages.containsKey(page)) {
            return pages.get(page);
        } else {
            return "";
        }
    }

    public Map<Integer, String> getPages() {
        return pages;
    }

    public void setPages(Map<Integer, String> pages) {
        this.pages = pages;
    }

    public int size() {
        return pages.size();
    }
}
