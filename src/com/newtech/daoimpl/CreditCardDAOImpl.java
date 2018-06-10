package com.newtech.daoimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.newtech.dao.ICreditCardDAO;
import com.newtech.vo.CreditCardBean;

public class CreditCardDAOImpl implements ICreditCardDAO {

	private Connection con = null;
	private PreparedStatement pspt = null;
	private ResultSet rs = null;
//	private CreditCardBean bean = null;
//	private List<CreditCardBean> beans = null;
	
	public CreditCardDAOImpl(Connection con) {
		this.con = con;
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
		CreditCardBean bean = null;
		System.out.println("impl"+id);
		String sql = "select card_id, card_type, card_fk_user_id from ntbs_credit_card where card_id = ?";
		pspt = con.prepareStatement(sql);
		pspt.setString(1, sql);
		rs = pspt.executeQuery();
		System.out.println("resultset"+rs.next());
		if(rs.next()) {
			bean = new CreditCardBean();
			bean.setCard_id(id);
			bean.setCard_type(rs.getByte("card_type"));
			bean.setCard_user_id(rs.getInt("card_fk_user_id"));
		}
		System.out.println(bean + "test");
		return bean;
	}

	@Override
	public List<CreditCardBean> getCardByUser(int id) throws SQLException {
		String sql = "select * from ntbs_credit_card where card_fk_user_id = ?";
		pspt = con.prepareStatement(sql);
		pspt.setInt(1, id);
		rs = pspt.executeQuery();
		List<CreditCardBean> beans = new ArrayList<>();
		while(rs.next()) {
			CreditCardBean bean = new CreditCardBean();
			bean.setCard_id(rs.getString("card_id"));
			bean.setCard_type(rs.getByte("card_type"));
			bean.setCard_user_id(id);
			beans.add(bean);
		}
		return beans;
	}

	@Override
	public List<CreditCardBean> getAllCard() throws SQLException {
		List<CreditCardBean> beans = new ArrayList<>();
		String sql = "select * from ntbs_credit_card";
		Statement stmt = con.createStatement();
		rs = stmt.executeQuery(sql);
		while(rs.next()) {
			CreditCardBean bean = new CreditCardBean();
			bean.setCard_id(rs.getString("card_id"));
			bean.setCard_type(rs.getByte("card_type"));
			bean.setCard_user_id(rs.getInt("card_fk_user_id"));
			beans.add(bean);
		}
		return beans;
	}

}
