package vgrupper.coming.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import vgrupper.coming.entity.Book;

public interface BookRepository extends JpaRepository<Book, Long>{


}
