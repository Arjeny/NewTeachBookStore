package com.newtech.daoimpl;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.newtech.dao.IUserDAO;
import com.newtech.vo.UserBean;

public class UserDAOImpl implements IUserDAO {
	
	private Connection con = null;
	private PreparedStatement pspt = null;
	private ResultSet rs = null;
	private UserBean bean = null;
	
	public UserDAOImpl(Connection con){
		this.con = con;
	}

	@Override
	public boolean insert(UserBean bean) throws SQLException {
		String sql = "insert into ntbs_user values(null, ?, ?, ?, ?)";
		pspt = con.prepareStatement(sql);
		pspt.setString(1, bean.getUser_username());
		pspt.setString(2, bean.getUser_password());
		pspt.setString(3, bean.getUser_email());
		pspt.setDate(4, new Date(System.currentTimeMillis()));
		
		int update = pspt.executeUpdate();
		if(update > 0) {
			return true;
		}
		return false;
	}

	@Override
	public void update(UserBean bean) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public UserBean getUserByUsername(String username) throws SQLException {
		String sql = "select * from ntbs_user where user_username = ?";
		pspt = con.prepareStatement(sql);
		pspt.setString(1, username);
		rs = pspt.executeQuery();
		if(rs.next()){
			bean = new UserBean();
			bean.setUser_id(rs.getInt("user_id"));
			bean.setUser_username(username);
			bean.setUser_password(rs.getString("user_password"));
			bean.setUser_email(rs.getString("user_email"));
		}
		return bean;
	}

	@Override
	public List<UserBean> getAllUsers() throws SQLException {
		String sql = "select * from ntbs_user";
		List<UserBean> beans = null;
		UserBean bean = null;
		pspt = con.prepareStatement(sql);
		rs = pspt.executeQuery();
		
		while(rs.next()){
			bean = new UserBean();
			beans = new ArrayList<UserBean>();
			bean.setUser_username(rs.getString("user_username"));
			bean.setUser_password(rs.getString("user_password"));
			beans.add(bean);
		}
		
		return beans;
	}

}
