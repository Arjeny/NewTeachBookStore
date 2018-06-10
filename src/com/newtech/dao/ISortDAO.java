package com.newtech.dao;

import java.sql.SQLException;

import com.newtech.vo.SortBean;

/**
 * 提供对类别CRUD操作的标准接口
 * @author Mr.J
 *
 */
public interface ISortDAO {

	/**
	 * 增加一条记录
	 * @param bean
	 * @return 插入成功返回true，否则返回false
	 * @throws SQLException
	 */
	public boolean insert(SortBean bean) throws SQLException;
	
	/**
	 * 更新一条记录
	 * @param bean
	 * @throws SQLException
	 */
	public void update(SortBean bean) throws SQLException;
	
	/**
	 * 删除一条记录
	 * @param id
	 * @throws SQLException
	 */
	public void delete(int id) throws SQLException;
	
	/**
	 * 由类别id获取记录
	 * @param id
	 * @return
	 * @throws SQLException
	 */
	public SortBean getSortById(Byte id) throws SQLException;
	
	/**
	 * 由类别名称获取记录
	 * @param sortName
	 * @return
	 * @throws SQLException
	 */
	public SortBean getSortByName(String sortName) throws SQLException;
}
