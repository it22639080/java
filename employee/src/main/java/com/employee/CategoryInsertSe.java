package com.employee;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/CategoryInsert")
public class CategoryInsertSe extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
    public CategoryInsertSe() {
        super();
    }
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String Category = request.getParameter("categoryName");
		String Categoryt = request.getParameter("categoryType");
			
			boolean isTrue;
			
			isTrue=InsertCategoryDBUtill.insertCategory(Category, Categoryt);
			
			
			if(isTrue==true) {
				
				RequestDispatcher dis = request.getRequestDispatcher("View.jsp");
				dis.forward(request, response);
			}else
			{
				RequestDispatcher dis2 = request.getRequestDispatcher("unView.jsp");
				dis2.forward(request, response);
			}
	}

}
