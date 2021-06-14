package com.produtos.apiRest.controller;

import java.util.List;

import com.produtos.apiRest.models.Book;
import com.produtos.apiRest.repository.BookRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/api") // o value do requestMapping define a roda padrão
public class BookController {
    @Autowired
    BookRepository bookRepository;

    @GetMapping("/books")
    public List<Book> listaBooks() {
        return bookRepository.findAll();
    }

    @GetMapping("/books/{id}")
    public Book findBook(@PathVariable(value = "id") Long id) {
        return bookRepository.findById(id).get();
    }

    @PostMapping("/books")
    public Book saveBook(@RequestBody Book book) {
        return bookRepository.save(book);
    }

    @PutMapping("/books")
    public Book updateBook(@RequestBody Book book) {
        return bookRepository.save(book);
        // não vai salvar um novo produto pois no body está vindo o ID
        // ele procura o item com o Id correpondente e o atualiza
    }

    @DeleteMapping("/books")
    public void deletaProduto(@RequestBody Book book) {
        bookRepository.delete(book);
    }

}
