package br.com.guilh.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.guilh.model.Book;

public interface BookRepository extends JpaRepository<Book, Long> {}