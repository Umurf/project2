package com.oww.app.controller;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oww.app.Execute;
import com.oww.app.Result;
import com.oww.app.dao.UserDAO;
import com.oww.app.dto.UserDTO;
import com.oww.app.vo.SearchVO;

public class AdminController implements Execute{
	@Override
	public Result execute(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {

		
		String searchType = request.getParameter("searchType");
		String keyword = request.getParameter("keyword");
		UserDAO userDAO = new UserDAO();
		List<UserDTO> userList = new ArrayList<>();
		
		System.out.println(searchType);
		System.out.println(keyword);
		
		SearchVO searchVO = new SearchVO();
		
		searchVO.setKeyword(keyword);
		searchVO.setSearchType(searchType);
		
		if(searchVO.getSearchType() == null) {
			searchVO.setKeyword("");
			searchVO.setSearchType("email");
		}
		if(searchVO.getSearchType().equals("email")) {
			userList = userDAO.searchByEmail(searchVO);
		}else if(searchVO.getSearchType().equals("nickname")) {
			userList = userDAO.searchByNickname(searchVO);
		}
		
		request.setAttribute("userList", userList);
		request.getRequestDispatcher("/member/views/admin.jsp").forward(request, response);
		return null;
	}
}


















