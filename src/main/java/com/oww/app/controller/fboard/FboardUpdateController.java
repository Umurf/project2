package com.oww.app.controller.fboard;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oww.app.Execute;
import com.oww.app.Result;
import com.oww.app.dao.FboardDAO;

public class FboardUpdateController implements Execute{
	@Override
	public Result execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	int fboardNumber = Integer.valueOf(request.getParameter("fboardNumber"));
	FboardDAO fboardDAO = new FboardDAO();
//	req.setAttribute("fboard", fboardDAO.selectAll(fboardNumber));
	request.setAttribute("fboard", fboardDAO.selectAll());
	//fboardList -> fboard 변경

	request.getRequestDispatcher("/board/views/rewriting.jsp").forward(request, response);
		
		
	return null;
	}
}