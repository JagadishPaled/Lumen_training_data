package com.training.services;

import java.util.List;

import com.training.Book;
import com.training.ifaces.CrudRepository;

public class BookService implements CrudRepository<Book> {

	@Override
	public boolean save(Book entity) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Book> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
