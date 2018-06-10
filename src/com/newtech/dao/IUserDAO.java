package com.newtech.dao;

import java.sql.SQLException;
import java.util.List;

import com.newtech.vo.UserBean;

public interface IUserDAO {

	/**
	 * 新增一条记录
	 * @param bean
	 * @throws SQLException 
	 */
	public boolean insert(UserBean bean) throws SQLException;
	
	/**
	 * 更新一条记录
	 * @param bean
	 */
	public void update(UserBean bean) throws SQLException;
	
	/**
	 * 获取一条user的记录
	 * @return 返回一个UserBean
	 */
	public UserBean getUserByUsername(String username) throws SQLException;
	
	/**
	 * 获取所有用户，返回一个list
	 * @return 返回一个用户list
	 */
	public List<UserBean> getAllUsers() throws SQLException;
}
