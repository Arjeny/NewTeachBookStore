package com.newtech.dao;

import java.sql.SQLException;
import java.util.List;

import com.newtech.vo.BookBean;

/**
 * 图书操作方法接口
 * 提供各种CRUD接口
 * @author Mr.J
 *
 */
public interface IBookDAO {

	/**
	 * 插入图书
	 * @param bean
	 * @return 插入成功返回true，否则返回false
	 */
	public boolean insert(BookBean bean) throws SQLException;
	
	/**
	 * 根据id删除图书
	 * @param id
	 */
	public void delete(int id) throws SQLException;
	
	/**
	 * 更新图书信息
	 * @param bean
	 */
	public void update(BookBean bean) throws SQLException;
	
	/**
	 * 根据名字查找图书
	 * @param bookName
	 * @return 返回图书实体
	 */
	public BookBean getBookByName(String bookName) throws SQLException;
	
	/**
	 * 根据id查找书籍
	 * @param id
	 * @return 返回一个图书的实体
	 * @throws SQLException
	 */
	public BookBean getBookById(int id) throws SQLException;
	
	/**
	 * 根据类别查找图书
	 * @param sortId
	 * @return 返回一个图书的list
	 */
	public List<BookBean> getBookBySort(int sortId) throws SQLException;
}
