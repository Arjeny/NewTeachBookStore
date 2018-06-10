package com.newtech.daofactory;

import java.io.UnsupportedEncodingException;
import java.sql.SQLException;
import java.util.List;

import com.newtech.daoproxy.BookDAOProxy;
import com.newtech.daoproxy.CreditCardDAOProxy;
import com.newtech.daoproxy.SortDAOProxy;
import com.newtech.daoproxy.UserDAOProxy;
import com.newtech.vo.BookBean;
import com.newtech.vo.CreditCardBean;

public class DAOFactory {

	public static UserDAOProxy getUserDAOProxyInstance(){
		UserDAOProxy dao = null;
		try{
			dao = new UserDAOProxy();
		}catch(Exception e){
			e.printStackTrace();
		}
		return dao;
	}
	
	public static BookDAOProxy getBookDAOProxyInstance(){
		BookDAOProxy dao = null;
		try{
			dao = new BookDAOProxy();
		}catch (Exception e) {
			e.printStackTrace();
		}
		return dao;
	}
	
	public static SortDAOProxy getSortDAOProxyInstance(){
		SortDAOProxy dao = null;
		try{
			dao = new SortDAOProxy();
		}catch (Exception e) {
			e.printStackTrace();
		}
		return dao;
	}
	
	public static CreditCardDAOProxy getCreditCardDAOProxyInstance(){
		CreditCardDAOProxy dao = null;
		try {
			dao = new CreditCardDAOProxy();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return dao;
	}
	
	public static void main(String[] args) throws UnsupportedEncodingException {
		try {
			String id = "6235897";
			BookBean book = getBookDAOProxyInstance().getBookByName("»î×Å");
			System.out.println("book:" + book.getBook_author());
			CreditCardBean bean = getCreditCardDAOProxyInstance().getCardById(id);
			List<CreditCardBean> list = getCreditCardDAOProxyInstance().getCardByUser(1);
			List<CreditCardBean> l = getCreditCardDAOProxyInstance().getAllCard();
			System.out.println(l.toString()+"1111111");
			System.out.println(list.toString());
			System.out.println(bean);
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
