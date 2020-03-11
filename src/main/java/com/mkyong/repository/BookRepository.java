package com.mkyong.repository;

import org.springframework.data.repository.CrudRepository;

import com.mkyong.model.BookEntity;

public interface BookRepository extends CrudRepository<BookEntity, Long> {
}
