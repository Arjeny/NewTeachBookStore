package com.newtech.daoproxy;

import java.sql.SQLException;
import java.util.List;

import com.newtech.dao.IBookDAO;
import com.newtech.daoimpl.BookDAOImpl;
import com.newtech.util.DatabaseConnection;
import com.newtech.vo.BookBean;

public class BookDAOProxy implements IBookDAO {
	
	private DatabaseConnection dbc = null;
	private BookDAOImpl dao = null;
	private BookBean bean = null;
	
	public BookDAOProxy() throws SQLException {
		this.dbc = new DatabaseConnection();
		this.dao = new BookDAOImpl(this.dbc.getConnection());
	}

	@Override
	public boolean insert(BookBean bean) throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void delete(int id) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(BookBean bean) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public BookBean getBookByName(String bookName) throws SQLException {
		bean = dao.getBookByName(bookName);
		dbc.close();
		return bean;
	}

	@Override
	public List<BookBean> getBookBySort(int sortId) throws SQLException {
		List<BookBean> beans = dao.getBookBySort(sortId);
		dbc.close();
		return beans;
	}

	@Override
	public BookBean getBookById(int id) throws SQLException {
		bean = dao.getBookById(id);
		dbc.close();
		return bean;
	}

}
