package br.com.guilh.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.guilh.model.Person;

public interface PersonRepository extends JpaRepository<Person, Long> {}