package com.newtech.daoimpl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.newtech.dao.ISortDAO;
import com.newtech.vo.SortBean;

public class SortDAOImpl implements ISortDAO {

	private Connection con = null;
	private PreparedStatement pspt = null;
	private ResultSet rs = null;
	private SortBean bean = null;
	
	public SortDAOImpl(Connection con) {
		this.con = con;
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
		String sql = "select * from ntbs_sort where sort_id = ?";
		pspt = con.prepareStatement(sql);
		pspt.setInt(1, id);
		rs = pspt.executeQuery();
		if(rs.next()){
			bean = new SortBean();
			bean.setSort_id(id);
			bean.setSort_name(rs.getString("sort_name"));
		}
		return bean;
	}

	@Override
	public SortBean getSortByName(String sortName) throws SQLException {
		String sql = "select * from ntbs_sort where sort_name = ?";
		pspt = con.prepareStatement(sql);
		pspt.setString(1, sortName);
		rs = pspt.executeQuery();
		if(rs.next()){
			bean = new SortBean();
			bean.setSort_id(rs.getByte("sort_id"));
			bean.setSort_name(sortName);
		}
		return bean;
	}

}
