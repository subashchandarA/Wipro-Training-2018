package com.wipro.projects;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FormServelet
 */
@WebServlet("/FormServelet")
public class FormServelet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FormServelet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
//		String userName = request.getParameter("userName");
//		PrintWriter out= response.getWriter();
//		response.setContentType("text/html");
//		out.println("Welcome "+userName+"to html learning");
		
        Enumeration e=request.getParameterNames();
        PrintWriter out = response.getWriter();
        response.setContentType("text/html");
        while(e.hasMoreElements()){
        	String param= (String)e.nextElement();
        	String []values = request.getParameterValues(param);
        	for(int i=0;i<values.length;i++){
        		out.println("<h3>" + param +"</h3>");
        		out.print("<h3>" + values[i] +"</h3>");
        	}
        }
        	
        
        
			}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
