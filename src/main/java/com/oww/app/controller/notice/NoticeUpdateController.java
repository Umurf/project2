package com.oww.app.controller.notice;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oww.app.Execute;
import com.oww.app.Result;
import com.oww.app.dao.NoticeDAO;

public class NoticeUpdateController  implements Execute{
	@Override
	public Result execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	int noticeNumber = Integer.valueOf(request.getParameter("noticeNumber"));
	NoticeDAO noticeDAO = new NoticeDAO();
//	req.setAttribute("notice", noticeDAO.selectAll(noticeNumber));
	request.setAttribute("notice", noticeDAO.selectAll());


	request.getRequestDispatcher("/board/views/adminRewriting.jsp").forward(request, response);
		
		
	return null;
	}
}