package com.newtech.dao;

import java.sql.SQLException;
import java.util.List;

import com.newtech.vo.CreditCardBean;

/**
 * �ṩ�����ÿ���CRUD������׼�ӿ�
 * @author Mr.J
 *
 */
public interface ICreditCardDAO {

	/**
	 * ����һ����¼
	 * @param bean
	 * @return �ɹ�����true�����򷵻�false
	 * @throws SQLException
	 */
	public boolean insert(CreditCardBean bean) throws SQLException;
	
	/**
	 * ����һ����¼
	 * @param bean
	 * @throws SQLException
	 */
	public void update(CreditCardBean bean) throws SQLException;
	
	/**
	 * ����idɾ����¼
	 * @param id
	 * @throws SQLException
	 */
	public void delete(int id) throws SQLException;
	
	/**
	 * �������ÿ�id��ȡ��¼
	 * @param id
	 * @return ����һ�����ÿ���¼
	 * @throws SQLException
	 */
	public CreditCardBean getCardById(String id) throws SQLException;
	
	/**
	 * �������ÿ��û���ȡ��¼
	 * @param id
	 * @return �������ÿ��б�
	 * @throws SQLException
	 */
	public List<CreditCardBean> getCardByUser(int id) throws SQLException;
	
	/**
	 * ��ȡ�������ÿ���Ϣ
	 * @return ����һ�����ÿ���list
	 * @throws SQLException
	 */
	public List<CreditCardBean> getAllCard() throws SQLException;
}
