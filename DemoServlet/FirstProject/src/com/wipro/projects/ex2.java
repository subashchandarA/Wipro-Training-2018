package com.wipro.projects;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ex2
 */
@WebServlet("/ex2")
public class ex2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ex2() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
		out.println("<html>");
		out.println("<had>");
		out.println("<title> Request Object example </title>");
		out.println("</head>");
		
		out.println("<body bgcolor=\"yellow\">");
		
		out.println("<h1>"+"Request object Info: "+"</h1>" +"<br>");
		out.println("<b>Method : </b>"+request.getMethod()+"<br>");
		out.println("<b>Request URI : </b>"+request.getRequestURL() +"<br>" );
		out.println("<b> Protocol: </b>"+request.getProtocol() +"<br>" );
		out.println("<b>Path Info : </b>"+request.getPathInfo() +"<br>" );
		out.println("<b>Remote Address : </b>"+request.getRemoteAddr() +"<br>" );
		out.println("</body>");
		out.println("</html>");
		
		
		
		
		
		
		
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
