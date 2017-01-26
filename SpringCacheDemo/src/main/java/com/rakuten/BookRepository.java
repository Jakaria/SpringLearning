package com.rakuten;

public interface BookRepository {

    Book getByIsbn(String isbn);

}
