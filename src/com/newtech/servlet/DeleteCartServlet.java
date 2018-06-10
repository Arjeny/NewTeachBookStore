package com.newtech.servlet;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.newtech.daofactory.DAOFactory;
import com.newtech.vo.BookBean;

/**
 * Servlet implementation class DeleteCartServlet
 */
@WebServlet("/DeleteCartServlet")
public class DeleteCartServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DeleteCartServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	@SuppressWarnings("unchecked")
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int id = Integer.parseInt(request.getParameter("bookId"));
		List<BookBean> cartList = (List<BookBean>)request.getSession().getAttribute("cartList");
		BookBean book = null;
//		try {
//			book = DAOFactory.getBookDAOProxyInstance().getBookById(id);
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
		boolean flag = false;
		if(cartList == null){
			return;
		}
		else{
			for (BookBean bookBean : cartList) {
				if(bookBean.getBook_id() == id){
					if(bookBean.getNumber() > 1){
						bookBean.setNumber(bookBean.getNumber()-1);
					}else{
						flag = true;
						book = bookBean;
					}
				}
			}
			if(flag){
				cartList.remove(book);
			}
			
			request.getSession().setAttribute("cartList", cartList);
			request.setAttribute("cartList", cartList);
			request.getRequestDispatcher("cart.jsp").forward(request, response);
		}
	}

}
