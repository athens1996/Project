package com.Third.Final.controller.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.Third.Final.controller.model.Book;
@Repository
public class BookDaoImpl implements BookDao {

	@Autowired
	private EntityManager entityManager;
	@Override
	public List<Book>get() 
	{
	Session currentSession=entityManager.unwrap(Session.class);
	Query<Book> query= currentSession.createQuery("from Book",Book.class);
	List<Book> list=query.getResultList();
	return list;
	}

}
