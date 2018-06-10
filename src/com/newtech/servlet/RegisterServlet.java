package com.newtech.servlet;

import java.io.IOException;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.newtech.daofactory.DAOFactory;
import com.newtech.util.ValidateUtil;
import com.newtech.vo.UserBean;

/**
 * Servlet implementation class RegisterServlet
 */
@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RegisterServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String confirmPwd = request.getParameter("confirm_pwd");
		String email = request.getParameter("email");
		
//		List<UserBean> beans = null;
		UserBean bean = null;
		if(!password.equals(confirmPwd)){
			return;
		}
		if(ValidateUtil.isUsername(username) && ValidateUtil.isPassword(password)
				&& ValidateUtil.isEmail(email)){
			try {
//				beans = DAOFactory.getUserDAOProxyInstance().getAllUsers();
				bean = DAOFactory.getUserDAOProxyInstance().getUserByUsername(username);
				if(bean == null){
					bean = new UserBean();
					bean.setUser_username(username);
					bean.setUser_password(password);
					bean.setUser_email(email);
					DAOFactory.getUserDAOProxyInstance().insert(bean);
				}
			} catch (SQLException e) {	
				e.printStackTrace();
			}
		}
	}

}
