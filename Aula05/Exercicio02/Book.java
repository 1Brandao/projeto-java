package Exercicio02;

public class Book {
    private String name;
    private Integer pageNumbers;
    private Integer currentPage;
    private boolean isOpen;
    private Author author;

    public Book(String name, Integer pageNumbers, Integer currentPage, boolean isOpen, Author author) {
        this.name = name;
        this.pageNumbers = pageNumbers;
        this.currentPage = currentPage;
        this.isOpen = isOpen;
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public Integer getPageNumbers() {
        return pageNumbers;
    }

    public Integer getCurrentPage() {
        return currentPage;
    }

    public boolean isOpen() {
        return isOpen;
    }

    public Author getAuthor() {
        return author;
    }


}
