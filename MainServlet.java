package com.wipro.book.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.wipro.book.bean.AuthorBean;
import com.wipro.book.bean.BookBean;
import com.wipro.book.service.Administrator;

/**
 * Servlet implementation class MainServlet
 */
public class MainServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public MainServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		String op = request.getParameter("operation");
		ServletContext sc = getServletContext();
		RequestDispatcher rd = null;
		if(op.equals("AddBooks")){
			String result = addBook(request);
			if(result.equals("SUCCESS")){
				rd = sc.getRequestDispatcher("/Menu.html");
			}else if(result.equals("FAILURE")){
				rd = sc.getRequestDispatcher("/Failure.html");
			}else if(result.equals("INVALID")){
				rd = sc.getRequestDispatcher("/Invalid.html");
			}
		}else if (op.equals("Search")){
			BookBean ob = viewBook(request.getParameter("isbn"));
			if(ob==null){
				rd = sc.getRequestDispatcher("/Invalid.html");
			}
			else{
				rd = sc.getRequestDispatcher("/View.jsp");
			}
			
		}
		rd.forward(request, response);
	}

	public BookBean viewBook(String isbn) {
		Administrator administrator = new Administrator();
		BookBean mybean = administrator.viewBook(isbn);
		// write code here
		return mybean;
	}

	public String addBook(HttpServletRequest request) {
		String result = "";
		Administrator administrator = new Administrator();
		BookBean mybean =  new BookBean();
		mybean.setIsbn(request.getParameter("isbn"));
		mybean.setBookName(request.getParameter("bookName"));
		mybean.setBookType(request.getParameter("bookType").charAt(0));
		mybean.setCost(Float.parseFloat(request.getParameter("cost")));
		String authorName = request.getParameter("authorName");
		AuthorBean ab = new AuthorBean();
		ab.setAuthorName(authorName);
		mybean.setAuthor(ab);
		result = administrator.addBook(mybean);
		return result;

	}

}
