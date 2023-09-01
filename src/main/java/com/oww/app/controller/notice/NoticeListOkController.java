package com.oww.app.controller.notice;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.oww.app.Execute;
import com.oww.app.Result;
import com.oww.app.dao.NoticeDAO;

public class NoticeListOkController implements Execute{

	@Override
	public Result execute(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		
		NoticeDAO noticeDAO = new NoticeDAO();
		
		request.setAttribute("noticeList", noticeDAO.selectAll());
		//이제 경로 설정 하면 끝
		request.getRequestDispatcher("/board/project/notice.jsp").forward(request, response);
		
		System.out.println("NoticeList 컨트롤러 테스트");

		return null;
	}

}
