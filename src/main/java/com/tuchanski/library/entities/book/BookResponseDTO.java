package com.tuchanski.library.entities.book;

import java.util.Date;

public record BookResponseDTO(Integer id, String title, String author, Date releaseDate, String genre, String image) {
    public BookResponseDTO (Book book){
        this(book.getId(), book.getTitle(), book.getAuthor(), book.getReleaseDate(), book.getGenre(), book.getImage());
    }
}
