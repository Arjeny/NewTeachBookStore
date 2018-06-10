package com.newtech.daoproxy;

import java.sql.SQLException;
import java.util.List;

import com.newtech.dao.ICreditCardDAO;
import com.newtech.daoimpl.CreditCardDAOImpl;
import com.newtech.util.DatabaseConnection;
import com.newtech.vo.CreditCardBean;

public class CreditCardDAOProxy implements ICreditCardDAO {
	
	private DatabaseConnection dbc = null;
	private CreditCardDAOImpl dao = null;
	private CreditCardBean bean = null;
	
	public CreditCardDAOProxy() throws SQLException {
		this.dbc = new DatabaseConnection();
		this.dao = new CreditCardDAOImpl(dbc.getConnection());
	}

	@Override
	public boolean insert(CreditCardBean bean) throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void update(CreditCardBean bean) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(int id) throws SQLException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public CreditCardBean getCardById(String id) throws SQLException {
		System.out.println("proxy" + id);
		bean = dao.getCardById(id);
		dbc.close();
		return bean;
	}

	@Override
	public List<CreditCardBean> getCardByUser(int id) throws SQLException {
		List<CreditCardBean> beans = dao.getCardByUser(id);
		dbc.close();
		return beans;
	}

	@Override
	public List<CreditCardBean> getAllCard() throws SQLException {
		List<CreditCardBean> beans = dao.getAllCard();
		dbc.close();
		return beans;
	}

}
