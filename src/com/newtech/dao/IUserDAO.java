package com.newtech.dao;

import java.sql.SQLException;
import java.util.List;

import com.newtech.vo.UserBean;

public interface IUserDAO {

	/**
	 * ����һ����¼
	 * @param bean
	 * @throws SQLException 
	 */
	public boolean insert(UserBean bean) throws SQLException;
	
	/**
	 * ����һ����¼
	 * @param bean
	 */
	public void update(UserBean bean) throws SQLException;
	
	/**
	 * ��ȡһ��user�ļ�¼
	 * @return ����һ��UserBean
	 */
	public UserBean getUserByUsername(String username) throws SQLException;
	
	/**
	 * ��ȡ�����û�������һ��list
	 * @return ����һ���û�list
	 */
	public List<UserBean> getAllUsers() throws SQLException;
}
