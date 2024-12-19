// src/main/java/com/javaexercises/collections/LibraryCatalog.java

package com.javaexercises.collections;

import java.util.*;

/**
 * Exercise 3.1: Library Catalog
 * Implement a library catalog system using appropriate collections
 */
public class LibraryCatalog {
    private Set<Book> books;
    private Map<String, Book> isbnIndex;
    private Map<String, List<Book>> authorIndex;
    
    public LibraryCatalog() {
        // TODO: Initialize collections
    }
    
    /**
     * Adds a book to the catalog
     * @return true if the book was added, false if it already exists
     */
    public boolean addBook(Book book) {
        // TODO: Implement this method
        throw new UnsupportedOperationException("Method not implemented");
    }
    
    /**
     * Removes a book from the catalog by ISBN
     * @return true if the book was removed, false if it wasn't found
     */
    public boolean removeBook(String isbn) {
        // TODO: Implement this method
        throw new UnsupportedOperationException("Method not implemented");
    }
    
    /**
     * Finds a book by ISBN
     * @return the book or null if not found
     */
    public Book findByIsbn(String isbn) {
        // TODO: Implement this method
        throw new UnsupportedOperationException("Method not implemented");
    }
    
    /**
     * Finds all books by an author
     * @return list of books by the author
     */
    public List<Book> findByAuthor(String author) {
        // TODO: Implement this method
        throw new UnsupportedOperationException("Method not implemented");
    }
}

class Book {
    private String title;
    private String author;
    private String isbn;
    
    public Book(String title, String author, String isbn) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
    }
    
    // TODO: Implement equals, hashCode, and getters
}
