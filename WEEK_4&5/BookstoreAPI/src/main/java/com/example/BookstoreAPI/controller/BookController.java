package com.example.BookstoreAPI.controller;

import com.example.BookstoreAPI.entity.Book;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.HttpStatus;

//import java.awt.print.Book;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {
    private List<Book> books = new ArrayList<>();
    @GetMapping
    public ResponseEntity<List<Book>> getAllBooks(){
        return ResponseEntity.ok(books);
    }
    @PostMapping
    public ResponseEntity<Book> addBook(@RequestBody Book book){
        books.add(book);
        return ResponseEntity.status(HttpStatus.CREATED).body(book);
    }
    @PutMapping("/{id}")
    public ResponseEntity<Book> updateBook(@PathVariable Long id, @RequestBody Book updatedbook){
        Book book = books.stream().filter(b -> b.getId().equals(id)).findFirst().orElse(null);
        if(book != null){
            book.setId(updatedbook.getId());
            book.setTitle(updatedbook.getTitle());
            book.setAuthor(updatedbook.getAuthor());
            book.setPrice(updatedbook.getPrice());
            book.setIsbn(updatedbook.getIsbn());
            return ResponseEntity.ok(book);
        }
        else{
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Book> deleteBook(@PathVariable Long id){
        books.removeIf(b -> b.getId().equals(id));
        return ResponseEntity.noContent().build();
    }
}
