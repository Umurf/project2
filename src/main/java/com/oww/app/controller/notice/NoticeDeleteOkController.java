package com.oww.app.controller.notice;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oww.app.Execute;
import com.oww.app.Result;
import com.oww.app.dao.NoticeDAO;

public class NoticeDeleteOkController implements Execute{
	@Override
	public Result execute(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	NoticeDAO noticeDAO = new NoticeDAO();
	int noticeNumber = Integer.valueOf(request.getParameter("noticeNumber"));

	noticeDAO.delete(noticeNumber);

	response.sendRedirect("/board/boardListOk.bo");
		
	return null;
	}
}