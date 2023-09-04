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

	System.out.println("test01");
	NoticeDAO noticeDAO = new NoticeDAO();
	Result result = new Result();
	System.out.println("test02");
	int noticeNumber = Integer.valueOf(request.getParameter("noticeNumber"));

	System.out.println("test03");
	
	noticeDAO.delete(noticeNumber);
		
	System.out.println("test04");

    result.setRedirect(true);
    result.setPath(request.getContextPath());
		
    String contextPath = request.getContextPath();
    response.sendRedirect(contextPath + "/project/noticeListOk.no");
		
	return null;
	}
}