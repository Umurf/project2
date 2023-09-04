package com.oww.app.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.oww.app.Execute;
import com.oww.app.Result;
import com.oww.app.dao.UserDAO;
import com.oww.app.dto.UserDTO;

public class UserUpdateController implements Execute{

	@Override
	public Result execute(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		UserDAO userDAO = new UserDAO();
		UserDTO userDTO = new UserDTO();
		HttpSession session= request.getSession();
		session.getAttribute("userEmail");
		session.getAttribute("userNickname");
		
//		userDTO.setUserEmail(request.getParameter("userEmail"));
		userDTO.setUserNickname(request.getParameter("userNickname"));
		userDTO.setUserPassword(request.getParameter("newPassword"));
		System.out.println(userDTO.toString());
		
		response.sendRedirect("/member/views/userUpdateOk.me");

		return null;
	}

}
