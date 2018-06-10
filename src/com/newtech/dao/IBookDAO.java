package com.newtech.dao;

import java.sql.SQLException;
import java.util.List;

import com.newtech.vo.BookBean;

/**
 * ͼ����������ӿ�
 * �ṩ����CRUD�ӿ�
 * @author Mr.J
 *
 */
public interface IBookDAO {

	/**
	 * ����ͼ��
	 * @param bean
	 * @return ����ɹ�����true�����򷵻�false
	 */
	public boolean insert(BookBean bean) throws SQLException;
	
	/**
	 * ����idɾ��ͼ��
	 * @param id
	 */
	public void delete(int id) throws SQLException;
	
	/**
	 * ����ͼ����Ϣ
	 * @param bean
	 */
	public void update(BookBean bean) throws SQLException;
	
	/**
	 * �������ֲ���ͼ��
	 * @param bookName
	 * @return ����ͼ��ʵ��
	 */
	public BookBean getBookByName(String bookName) throws SQLException;
	
	/**
	 * ����id�����鼮
	 * @param id
	 * @return ����һ��ͼ���ʵ��
	 * @throws SQLException
	 */
	public BookBean getBookById(int id) throws SQLException;
	
	/**
	 * ����������ͼ��
	 * @param sortId
	 * @return ����һ��ͼ���list
	 */
	public List<BookBean> getBookBySort(int sortId) throws SQLException;
}
