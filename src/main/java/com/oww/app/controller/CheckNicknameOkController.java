package com.oww.app.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oww.app.Execute;
import com.oww.app.Result;
import com.oww.app.dao.UserDAO;

public class CheckNicknameOkController implements Execute{

	@Override
	public Result execute(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		UserDAO userDAO = new UserDAO();
		boolean isTrue = userDAO.checkNickname(request.getParameter("uname"));
		String result = null;
		//PrintWriter 가져오기 전에 설정해야함!
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out = response.getWriter();
		
		System.out.println(request.getParameter("uname"));
		if(isTrue) {
			result = "사용 가능한 닉네임";
		}else {
			result = "중복된 닉네임!";
		}
		
		out.print(result);
		out.close();
		
		return null;
	}

}
