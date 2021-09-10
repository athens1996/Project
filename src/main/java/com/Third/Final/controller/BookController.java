package com.Third.Final.controller;



import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.Third.Final.controller.model.Book;
import com.Third.Final.controller.service.BookService;

@RestController
@RequestMapping("/api")
public class BookController {

	@Autowired
	private BookService Bookservice;
	
	@GetMapping("/Book")
	public List<Book>get()
	{
	return Bookservice.get();
	}
}
	
	