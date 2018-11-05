package com.my.first;

import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigDecimal;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class CounterServlet
 */
@WebServlet("/counterServlet")
public class CounterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		BigDecimal bigNum1 = new BigDecimal(request.getParameter("num1"));
		BigDecimal bigNum2 = new BigDecimal(request.getParameter("num2"));
		String opt = request.getParameter("opt");
		BigDecimal bigTotle = new BigDecimal(0);
		switch (opt) {
		case "+":
			bigTotle = bigNum1.add(bigNum2);
			break;
		case "-":
			bigTotle = bigNum1.subtract(bigNum2);
			break;
		case "*":
			bigTotle = bigNum1.multiply(bigNum2);
			break;
		case "/":
			bigTotle = bigNum1.divide(bigNum2);
			break;
		}
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.println(bigTotle.doubleValue());
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
