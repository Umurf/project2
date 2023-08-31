package com.oww.app.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oww.app.Execute;
import com.oww.app.Result;
import com.oww.app.dao.UserDAO;

public class CheckEmailOkController implements Execute{

	@Override
	public Result execute(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		System.out.println("1--------------------");
		UserDAO userDAO = new UserDAO();
		boolean isTrue = userDAO.checkEmail(request.getParameter("mail"));
		String result = null;
		System.out.println("2--------------------");
		//PrintWriter 가져오기 전에 설정해야함!
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();
		
		System.out.println("3--------------------");
		
		System.out.println(request.getParameter("mail"));
		if(isTrue) {
			result = "사용가능";
		}else {
			result = "중복된 이메일 값!";
		}
		
		out.print(result);
		out.close();
		
		return null;
	}

}
