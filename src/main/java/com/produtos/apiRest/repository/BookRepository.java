package com.produtos.apiRest.repository;

import com.produtos.apiRest.models.Book;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
    // A interface com o JpaRepositoruy facilita a criação do CRUD

    Book findById(long id);
}
