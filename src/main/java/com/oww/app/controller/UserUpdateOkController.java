package com.oww.app.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oww.app.Execute;
import com.oww.app.Result;
import com.oww.app.dao.UserDAO;
import com.oww.app.dto.UserDTO;

public class UserUpdateOkController implements Execute{

	@Override
	public Result execute(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		UserDAO userDAO = new UserDAO();
		UserDTO userDTO = new UserDTO();
		userDAO.updateNickname("userNickname");
		userDAO.updatePassword("userPassword");
		
	
		response.sendRedirect(request.getContextPath());	
		
		


		return null;
	}

}
