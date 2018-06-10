package com.newtech.dao;

import java.sql.SQLException;
import java.util.List;

import com.newtech.vo.CreditCardBean;

/**
 * 提供对信用卡的CRUD操作标准接口
 * @author Mr.J
 *
 */
public interface ICreditCardDAO {

	/**
	 * 增加一条记录
	 * @param bean
	 * @return 成功返回true，否则返回false
	 * @throws SQLException
	 */
	public boolean insert(CreditCardBean bean) throws SQLException;
	
	/**
	 * 更新一条记录
	 * @param bean
	 * @throws SQLException
	 */
	public void update(CreditCardBean bean) throws SQLException;
	
	/**
	 * 根据id删除记录
	 * @param id
	 * @throws SQLException
	 */
	public void delete(int id) throws SQLException;
	
	/**
	 * 根据信用卡id获取记录
	 * @param id
	 * @return 返回一条信用卡记录
	 * @throws SQLException
	 */
	public CreditCardBean getCardById(String id) throws SQLException;
	
	/**
	 * 根据信用卡用户获取记录
	 * @param id
	 * @return 返回信用卡列表
	 * @throws SQLException
	 */
	public List<CreditCardBean> getCardByUser(int id) throws SQLException;
	
	/**
	 * 获取所有信用卡信息
	 * @return 返回一个信用卡的list
	 * @throws SQLException
	 */
	public List<CreditCardBean> getAllCard() throws SQLException;
}
