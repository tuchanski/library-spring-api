package com.tuchanski.library.entities.book;

import jakarta.persistence.*;
import lombok.*;
import java.util.Date;

@Entity(name = "book")
@Getter
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode(of = "id")
@ToString

public class Book {

    @Id
    @GeneratedValue(
            strategy = GenerationType.IDENTITY
    )
    private Integer id;

    private String title;
    private String author;
    private Date releaseDate;
    private String genre;
    private String image;

    public Book(BookRequestDTO bookRequestDTO){
        this.title = bookRequestDTO.title();
        this.author = bookRequestDTO.author();
        this.releaseDate = bookRequestDTO.releaseDate();
        this.genre = bookRequestDTO.genre();
        this.image = bookRequestDTO.image();
    }


}
