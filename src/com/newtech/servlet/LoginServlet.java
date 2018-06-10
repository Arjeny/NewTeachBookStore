package com.newtech.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.newtech.daofactory.DAOFactory;
import com.newtech.vo.BookBean;
import com.newtech.vo.UserBean;

/**
 * 实现登陆验证
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String username = request.getParameter("username");
		String password = request.getParameter("password");
		List<BookBean> cartList = null;
		
		try {
			UserBean bean = DAOFactory.getUserDAOProxyInstance().getUserByUsername(username);
			System.out.println(bean);
			if(bean != null && password.equals(bean.getUser_password())) {
				HttpSession session = request.getSession();
				session.setAttribute("user", bean);
				session.setAttribute("username", username);
				session.setAttribute("cartList", cartList);
				request.getRequestDispatcher("index.jsp").forward(request, response);
				
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
