package org.test.bookpub.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.test.bookpub.entity.Book;

/**
 * Author: 王俊超
 * Date: 2017-04-04 10:51
 * All Rights Reserved !!!
 */
@Repository
public interface BookRepository extends CrudRepository<Book, Long> {
    Book findBookByIsbn(String isbn);
}
