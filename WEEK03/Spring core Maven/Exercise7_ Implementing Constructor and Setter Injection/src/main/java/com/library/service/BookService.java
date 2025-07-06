package com.library.service;

import com.library.repository.BookRepository;

public class BookService {
    private final BookRepository primaryRepository;
    private BookRepository secondaryRepository;

    // Constructor Injection
    public BookService(BookRepository primaryRepository) {
        this.primaryRepository = primaryRepository;
    }

    // Setter Injection
    public void setSecondaryRepository(BookRepository secondaryRepository) {
        this.secondaryRepository = secondaryRepository;
    }

    public String getBookInfo() {
        return "Primary: " + primaryRepository.fetchBookData() + 
               "\nSecondary: " + secondaryRepository.fetchBookData();
    }
}