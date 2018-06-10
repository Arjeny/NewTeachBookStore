package com.newtech.daoproxy;

import java.sql.SQLException;

import com.newtech.dao.ISortDAO;
import com.newtech.daoimpl.SortDAOImpl;
import com.newtech.util.DatabaseConnection;
import com.newtech.vo.SortBean;

public class SortDAOProxy implements ISortDAO {

	private DatabaseConnection dbc = null;
	private SortDAOImpl dao = null;
	private SortBean bean = null;
	
	public SortDAOProxy() throws SQLException {
		this.dbc = new DatabaseConnection();
		this.dao = new SortDAOImpl(dbc.getConnection());
	}
	
	@Override
	public boolean insert(SortBean bean) throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void update(SortBean bean) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(int id) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public SortBean getSortById(Byte id) throws SQLException {
		bean = dao.getSortById(id);
		dbc.close();
		return bean;
	}

	@Override
	public SortBean getSortByName(String sortName) throws SQLException {
		bean = dao.getSortByName(sortName);
		dbc.close();
		return bean;
	}

}
