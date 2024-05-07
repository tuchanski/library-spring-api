package com.tuchanski.library.entities.book;

import java.util.Date;

public record BookRequestDTO(String title, String author, Date releaseDate, String genre, String image){
}
