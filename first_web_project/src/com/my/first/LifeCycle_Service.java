package com.my.first;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LifeCycle_Service
 */
public class LifeCycle_Service extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LifeCycle_Service() {
        System.out.println("实例化Servlet对象");
        // TODO Auto-generated constructor stub
    }
    @Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("初始化值");
	}
    
	@Override
	protected void service(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("创建请求和响应对象");
		super.service(arg0, arg1);
		
	}


	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("UTF-8");
		String username = request. getParameter("username");
		String pwd = request.getParameter("pwd");

		response.setContentType("text/html;charset=\"UTF-8\"");
		
		PrintWriter out = response.getWriter();
		out.println("做的不错!<br/>");
		if ("admin".equals(username) && "000000".equals(pwd)) {
//			System.out.println("");
			out.println("恭喜你登录成功");
		} else{
			out.println("登录名或密码有误！");
		}
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
//		super.destroy();
		System.out.println("销毁对象，释放资源");
	}
}
