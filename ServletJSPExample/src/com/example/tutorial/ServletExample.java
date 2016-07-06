package com.example.tutorial;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletExample
 */
@WebServlet("/aaa")
public class ServletExample extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletExample() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		if(request.getParameter("name") ==null || request.getParameter("pass")==null){
		getServletContext().getRequestDispatcher("/index.jsp").forward(request, response);
		return;
		}
		String name= request.getParameter("name");
		String pass = request.getParameter("pass");
		// the next two lines let servelet to print the result by itself
		//PrintWriter out = response.getWriter();
		//out.println("halo this is my first servlet\n my name is: "+ name + "\n my password is: " + pass  );
		// to display the result in to other jsp use as follows
		request.setAttribute("nameAttribute", name);
		request.setAttribute("passAttribute", pass);
		getServletContext().getRequestDispatcher("/resultPage.jsp").forward(request, response);
	}

}
