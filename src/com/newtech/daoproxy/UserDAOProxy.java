package com.newtech.daoproxy;

import java.sql.SQLException;
import java.util.List;

import com.newtech.dao.IUserDAO;
import com.newtech.daoimpl.UserDAOImpl;
import com.newtech.util.DatabaseConnection;
import com.newtech.vo.UserBean;

public class UserDAOProxy implements IUserDAO {

	private DatabaseConnection dbc = null;
	private UserDAOImpl dao = null;
	
	public UserDAOProxy() throws SQLException {
		dbc = new DatabaseConnection();
		dao = new UserDAOImpl(dbc.getConnection());
	}
	
	@Override
	public boolean insert(UserBean bean) throws SQLException{
		boolean flag = false;
		if(dao.getUserByUsername(bean.getUser_username()) == null){
			flag = dao.insert(bean);
		}
		dbc.close();
		return flag;
	}
	
	@Override
	public List<UserBean> getAllUsers() throws SQLException{
		List<UserBean> beans = dao.getAllUsers();
		dbc.close();
		return beans;
	}
	
	@Override
	public UserBean getUserByUsername(String username) throws SQLException{
		UserBean bean = dao.getUserByUsername(username);
		dbc.close();
		return bean;
	}

	@Override
	public void update(UserBean bean) throws SQLException {
		// TODO Auto-generated method stub
		
	}
}
