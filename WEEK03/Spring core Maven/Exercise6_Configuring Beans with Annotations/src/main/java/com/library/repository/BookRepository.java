package com.library.repository;

import org.springframework.stereotype.Repository;

@Repository
public class BookRepository {
    // Repository methods would go here
    public String getBookInfo() {
        return "Book information from repository";
    }
}