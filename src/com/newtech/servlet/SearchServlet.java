package com.newtech.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.newtech.daofactory.DAOFactory;
import com.newtech.vo.BookBean;
import com.newtech.vo.SortBean;

/**
 * Servlet implementation class SearchServlet
 */
@WebServlet("/SearchServlet")
public class SearchServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SearchServlet() {
        super();
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String keyword = request.getParameter("keyword");
		//解决中文乱码问题
		String keyword2utf = new String(keyword.getBytes("iso-8859-1"),"utf8");
		try{
			SortBean sortBean = DAOFactory.getSortDAOProxyInstance().getSortByName(keyword2utf);
			byte id = sortBean.getSort_id();
			List<BookBean> bookBeans = DAOFactory.getBookDAOProxyInstance().getBookBySort(id);
			if(bookBeans != null){
				request.setAttribute("booklist", bookBeans);
			}
			request.getRequestDispatcher("searchresult.jsp").forward(request, response);
		}catch(Exception e){
			e.printStackTrace();
		}
	}

}
