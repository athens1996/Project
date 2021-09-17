package com.Third.Final.controller.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.Third.Final.controller.dao.BookDao;
import com.Third.Final.controller.model.Book;


@Service

public class BookServiceimpl implements BookService {
	
	@Autowired
	private BookDao bookDao;
	@Transactional
	@Override
	public List<Book> get() {
return 	bookDao.get();

	}

}
