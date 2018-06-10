package com.newtech.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.newtech.daofactory.DAOFactory;
import com.newtech.vo.BookBean;

/**
 * Servlet implementation class AddCartInDetailServlet
 */
@WebServlet("/AddCartInDetailServlet")
public class AddCartInDetailServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddCartInDetailServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	@SuppressWarnings("unchecked")
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int id = Integer.parseInt(request.getParameter("bookId"));
		boolean found = false;
		System.out.println(id);
		System.out.println(request.getSession().getAttribute("用户名"+"username"));
		if(request.getSession().getAttribute("username") == null) {
			request.getRequestDispatcher("login.html").forward(request, response);
		}
		try {
			List<BookBean> cartList = (List<BookBean>) request.getSession().getAttribute("cartList");
			if(cartList == null) {
				cartList = new ArrayList<>();
				cartList.add(DAOFactory.getBookDAOProxyInstance().getBookById(id));
				System.out.println(DAOFactory.getBookDAOProxyInstance().getBookById(id));
			}else{
				for (BookBean bookBean : cartList) {
					if(id == bookBean.getBook_id()) {
						bookBean.setNumber(bookBean.getNumber()+1);
						found = true;
						System.out.println("num" + bookBean.getNumber());
						break;
					}
				}
				if(!found){
					cartList.add(DAOFactory.getBookDAOProxyInstance().getBookById(id));
				}
			}
			request.getSession().setAttribute("cartList", cartList);
			request.setAttribute("cartList", cartList);
			System.out.println("购物列表"+cartList.size());
			request.getRequestDispatcher("index.jsp").forward(request, response);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
