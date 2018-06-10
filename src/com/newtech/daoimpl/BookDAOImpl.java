package com.newtech.daoimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.newtech.dao.IBookDAO;
import com.newtech.vo.BookBean;

public class BookDAOImpl implements IBookDAO {

	private Connection con = null;
	private PreparedStatement pspt = null;
	private ResultSet rs = null;
	private BookBean bean = null;
	
	public BookDAOImpl(Connection con) {
		this.con = con;
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
		String sql = "select * from ntbs_book where book_name = ?";
		pspt = con.prepareStatement(sql);
		pspt.setString(1, bookName);
		rs = pspt.executeQuery();
		if(rs.next()){
			bean = new BookBean();
			bean.setBook_id(rs.getInt("book_id"));
			bean.setBook_author(rs.getString("book_author"));
			bean.setBook_name(rs.getString("book_name"));
			bean.setBook_sort_id(rs.getByte("book_fk_sort_id"));
			bean.setBook_publisher(rs.getString("book_publisher"));
			bean.setBook_price(rs.getShort("book_price"));
			bean.setBook_description(rs.getString("book_description"));
			bean.setBook_isbn(rs.getString("book_isbn"));
			bean.setBook_img(rs.getString("book_img"));
		}
		return bean;
	}

	@Override
	public List<BookBean> getBookBySort(int sortId) throws SQLException {
		String sql = "select * from ntbs_book where book_fk_sort_id = ?";
		List<BookBean> beans = new ArrayList<BookBean>();
		pspt = con.prepareStatement(sql);
		pspt.setInt(1, sortId);
		rs = pspt.executeQuery();
		while(rs.next()){
			bean = new BookBean();
			bean.setBook_id(rs.getInt("book_id"));
			bean.setBook_author(rs.getString("book_author"));
			bean.setBook_name(rs.getString("book_name"));
			bean.setBook_sort_id(rs.getByte("book_fk_sort_id"));
			bean.setBook_publisher(rs.getString("book_publisher"));
			bean.setBook_price(rs.getShort("book_price"));
			bean.setBook_description(rs.getString("book_description"));
			bean.setBook_isbn(rs.getString("book_isbn"));
			bean.setBook_img(rs.getString("book_img"));
			beans.add(bean);
		}
		return beans;
	}

	@Override
	public BookBean getBookById(int id) throws SQLException {
		String sql = "select * from ntbs_book where book_id = ?";
		pspt = con.prepareStatement(sql);
		pspt.setInt(1, id);
		rs = pspt.executeQuery();
		if(rs.next()){
			bean = new BookBean();
			bean.setBook_id(rs.getInt("book_id"));
			bean.setBook_author(rs.getString("book_author"));
			bean.setBook_name(rs.getString("book_name"));
			bean.setBook_sort_id(rs.getByte("book_fk_sort_id"));
			bean.setBook_publisher(rs.getString("book_publisher"));
			bean.setBook_price(rs.getShort("book_price"));
			bean.setBook_description(rs.getString("book_description"));
			bean.setBook_isbn(rs.getString("book_isbn"));
			bean.setBook_img(rs.getString("book_img"));
		}
		return bean;
	}
}
