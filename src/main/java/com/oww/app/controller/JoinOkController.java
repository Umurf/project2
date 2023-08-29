package com.oww.app.controller;

import java.io.IOException;
import java.rmi.ServerException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oww.app.Execute;
import com.oww.app.Result;
import com.oww.app.dao.UserDAO;
import com.oww.app.dto.UserDTO;


public class JoinOkController implements Execute{
	
	public Result execute(HttpServletRequest request, HttpServletResponse response) throws IOException, ServerException{
		UserDAO userDAO = new UserDAO();
        UserDTO userDTO = new UserDTO();
        Result result = new Result();

        userDTO.setUserEmail(request.getParameter("UserEmail"));
        userDTO.setUserPassword(request.getParameter("UserPassword"));
        userDTO.setUserNickname(request.getParameter("UserNickname"));
        System.out.println(userDTO);
        
        userDAO.join(userDTO);
        
        result.setRedirect(true);//true를 보내서
        result.setPath(request.getContextPath());
        
        return result;
	}
}