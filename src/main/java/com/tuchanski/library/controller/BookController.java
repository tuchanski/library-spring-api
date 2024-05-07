package com.tuchanski.library.controller;

import com.tuchanski.library.entities.book.Book;
import com.tuchanski.library.entities.book.BookRepository;
import com.tuchanski.library.entities.book.BookRequestDTO;
import com.tuchanski.library.entities.book.BookResponseDTO;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("books")
public class BookController {

    private final BookRepository bookRepository;
    public BookController(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @PostMapping
    public void addBook(@RequestBody BookRequestDTO bookData){
        bookRepository.save(new Book(bookData));
    }

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @DeleteMapping("{bookId}")
    public void deleteBook(@PathVariable Integer bookId){
        bookRepository.deleteById(bookId);
    }

    @CrossOrigin(origins = "*", allowedHeaders = "*")
    @GetMapping
    public List<BookResponseDTO> getAllBooks(){
        List<Book> books = bookRepository.findAll();
        List<BookResponseDTO> booksDTO = new ArrayList<>();
        for (Book book : books) {
            booksDTO.add(new BookResponseDTO(book));
        }
        return booksDTO;
    }
}
