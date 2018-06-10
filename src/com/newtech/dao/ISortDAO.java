package com.newtech.dao;

import java.sql.SQLException;

import com.newtech.vo.SortBean;

/**
 * �ṩ�����CRUD�����ı�׼�ӿ�
 * @author Mr.J
 *
 */
public interface ISortDAO {

	/**
	 * ����һ����¼
	 * @param bean
	 * @return ����ɹ�����true�����򷵻�false
	 * @throws SQLException
	 */
	public boolean insert(SortBean bean) throws SQLException;
	
	/**
	 * ����һ����¼
	 * @param bean
	 * @throws SQLException
	 */
	public void update(SortBean bean) throws SQLException;
	
	/**
	 * ɾ��һ����¼
	 * @param id
	 * @throws SQLException
	 */
	public void delete(int id) throws SQLException;
	
	/**
	 * �����id��ȡ��¼
	 * @param id
	 * @return
	 * @throws SQLException
	 */
	public SortBean getSortById(Byte id) throws SQLException;
	
	/**
	 * ��������ƻ�ȡ��¼
	 * @param sortName
	 * @return
	 * @throws SQLException
	 */
	public SortBean getSortByName(String sortName) throws SQLException;
}
