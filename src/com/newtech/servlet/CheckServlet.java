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
import com.newtech.vo.CreditCardBean;

/**
 * Servlet implementation class CheckServlet
 */
@WebServlet("/CheckServlet")
public class CheckServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CheckServlet() {
        super();
    }
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	@SuppressWarnings("unchecked")
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String card_id = request.getParameter("cardId");
		System.out.println("card_id" + card_id);
		try {
//			CreditCardBean bean = DAOFactory.getCreditCardDAOProxyInstance().getCardById(card_id);
			List<CreditCardBean> list = DAOFactory.getCreditCardDAOProxyInstance().getAllCard();
			for (CreditCardBean creditCardBean : list) {
				if(card_id.equals(creditCardBean.getCard_id()))	{
					List<BookBean> cartList = (List<BookBean>)request.getSession().getAttribute("cartList");
					cartList.removeAll(cartList);
					request.getSession().setAttribute("cartList", cartList);
					System.out.println("支付成功");
					response.getWriter().println("<h1>pay successfully</h1>");
					break;
				}
			}
//			if(bean != null) {
//				List<BookBean> cartList = (List<BookBean>)request.getSession().getAttribute("cartList");
//				cartList.removeAll(cartList);
//				request.getSession().setAttribute("cartList", cartList);
//				System.out.println("支付成功");
//				response.getWriter().println("<h1>pay successfully</h1>");
//			}
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}

}
