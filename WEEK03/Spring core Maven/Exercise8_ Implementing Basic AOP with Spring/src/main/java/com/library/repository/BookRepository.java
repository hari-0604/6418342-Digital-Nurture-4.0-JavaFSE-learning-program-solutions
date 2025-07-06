package com.library.repository;

public class BookRepository {
    public String findBookById(String id) {
        // Simulate database delay
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        return "Book-" + id + " (Title)";
    }
}