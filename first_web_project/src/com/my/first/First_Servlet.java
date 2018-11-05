package com.my.first;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class First_Form
 */
public class First_Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public First_Servlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		response.setContentType("text/html;charset=\"UTF-8\"");
		PrintWriter out = response.getWriter();
	
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<head>");
		out.println("<meta charset=\"UTF-8\">");
		out.println("<title>Insert title here</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h3>第一个web文件</h3>");
		out.println("<form action=\"\" method=\"post\">");
		out.println("<table>");
		out.println("<tr><td>name:</td><td><input type=\"text\" id=\"name\" value=\"\"/></td></tr>");
		out.println("<tr><td>password:</td><td><input type=\"password\" id=\"pwd\" value=\"\"/></td></tr>");
		out.println("<tr><td><input type=\"submit\" id=\"sbt\" value=\"\"></td><td><input type=\"reset\" id=\"rst\" value=\"\"/></td></tr>");
		out.println("</table></form></body></html>");
//		out.println("");

		
		out.flush();
		out.close();
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
